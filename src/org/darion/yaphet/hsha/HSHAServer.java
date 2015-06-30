package org.darion.yaphet.hsha;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class HSHAServer implements HSHAConstant {

	private String host;
	private int port;

	private Acceptor acceptor;
	private ThreadPoolExecutor processorExecutor;

	public HSHAServer(String host, int port) {
		this.host = host;
		this.port = port;
		acceptor = new Acceptor();
		processorExecutor = new ThreadPoolExecutor(CORE_POOL_SIZE,
				MAXIMUM_POOL_SIZE, KEEP_ALIVE_TIME, TimeUnit.SECONDS,
				new ArrayBlockingQueue<Runnable>(32));
	}

	public void start() {
		acceptor.run();
	}
}
