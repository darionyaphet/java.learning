package org.darion.yaphet.threads;

import java.util.concurrent.ArrayBlockingQueue;

public class Producer implements Runnable {
    private ArrayBlockingQueue<Long> queue;

    public Producer(ArrayBlockingQueue<Long> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        synchronized (queue) {
            try {
                if (queue.size() == 32) {
                    queue.wait();
                } else {
                    long now = System.currentTimeMillis();
                    System.out.println("Producer Appended : " + queue.add(now));
                    queue.notify();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
