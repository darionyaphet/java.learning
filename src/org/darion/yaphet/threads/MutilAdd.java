package org.darion.yaphet.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MutilAdd {
    private static int counter = 0;
    private static Object lock = new Object();

    private static class MutilAddThread implements Runnable {

        @Override
        public void run() {
            synchronized (lock) {
                counter += 1;
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(32);
        for (int index = 0; index < 1024; index++) {
            service.submit(new MutilAdd.MutilAddThread());
        }

        java.lang.Thread.sleep(1000);
        System.out.println(counter);
        service.shutdown();
    }
}
