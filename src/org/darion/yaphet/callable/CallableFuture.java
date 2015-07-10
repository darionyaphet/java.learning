package org.darion.yaphet.callable;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class CallableFuture {

	private static class RandomCallback implements Callable<Integer> {
		private long seed = 0;

		public RandomCallback(long seed) {
			this.seed = seed;
		}

		@Override
		public Integer call() throws Exception {
			Thread.sleep(1000);
			return new Random(seed).nextInt(1024);
		}

	}

	public static void main(String[] args) throws InterruptedException,
			ExecutionException {
		long seed = System.currentTimeMillis();
		FutureTask<Integer> future = new FutureTask<Integer>(
				new RandomCallback(seed));
		Thread thread = new Thread(future);
		thread.start();
		
		try {
			System.out.println(future.get(100, TimeUnit.MILLISECONDS));
		} catch (TimeoutException e) {
			System.out.println("Sorry to Say : Time-Out");
		}
	}
}
