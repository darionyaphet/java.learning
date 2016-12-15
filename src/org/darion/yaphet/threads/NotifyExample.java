package org.darion.yaphet.threads;

import java.util.concurrent.ArrayBlockingQueue;

public class NotifyExample {

    private static final int SIZE = 7;

    public static void main(String[] args) {
        ArrayBlockingQueue<Long> queue = new ArrayBlockingQueue<>(SIZE);
        Thread consumer = new Thread(new Consumer(queue));
        Thread producer = new Thread(new Producer(queue));
        consumer.start();
        producer.start();
    }
}
