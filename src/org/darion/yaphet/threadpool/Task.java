package org.darion.yaphet.threadpool;

public class Task implements Runnable {

	@Override
	public void run() {
		
		while (true) {
			System.out.println(Thread.currentThread().getName()
					+ " Working ...");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
