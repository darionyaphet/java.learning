package org.darion.yaphet.threads;

import java.util.concurrent.ArrayBlockingQueue;

public class Consumer implements Runnable {
    private ArrayBlockingQueue<Long> queue;

    public Consumer(ArrayBlockingQueue<Long> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        synchronized (queue) {
            try {
                if (queue.size() == 0) {
                    queue.wait();
                } else {
                    System.out.println("Consumer Fetched : " + queue.poll());
                    queue.notify();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
