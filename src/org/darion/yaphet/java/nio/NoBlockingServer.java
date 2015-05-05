package org.darion.yaphet.java.nio;

import java.io.IOException;
import java.nio.channels.Selector;

public class NoBlockingServer implements Runnable {

	private String host;
	private int port;

	private volatile boolean isRunning = true;
	private Selector selector;

	public NoBlockingServer(String host, int port) {
		this.host = host;
		this.port = port;
	}

	@Override
	public void run() {
		initiation();

		while (isRunning) {

		}
	}

	private void initiation() {
		try {
			selector = Selector.open();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void doAccept() {

	}

	private void doRead() {

	}

	private void doWrite() {

	}

	public static void main(String[] args) {
		Thread thread = new Thread(new NoBlockingServer("127.0.0.1", 8989));
		thread.start();
	}

}
