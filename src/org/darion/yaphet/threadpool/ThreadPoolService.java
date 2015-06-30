package org.darion.yaphet.threadpool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

public class ThreadPoolService {

	private static final int corePoolSize = 1;
	private static final int maximumPoolSize = 1;
	private static final int keepAliveTime = 1;
	private static final BlockingQueue<Runnable> workQueue = null;
	private static final ThreadFactory threadFactory = new NamedThreadFactory();

	public static void main(String[] args) {

		RejectedExecutionHandler handler = null;
		ThreadPool pool = new ThreadPool(corePoolSize, maximumPoolSize,
				keepAliveTime, TimeUnit.SECONDS, workQueue, threadFactory,
				handler);
	}
}
