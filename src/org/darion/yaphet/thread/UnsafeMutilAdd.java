package org.darion.yaphet.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UnsafeMutilAdd {
    private static int counter = 0;

    private static class MutilAddThread implements Runnable {
        @Override
        public void run() {
            counter += 1;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(32);
        for (int index = 0; index < 1024; index++) {
            service.submit(new MutilAddThread());
        }

        java.lang.Thread.sleep(1000);
        System.out.println(counter);
        service.shutdown();
    }
}
