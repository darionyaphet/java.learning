package org.darion.yaphet.hsha;

public class Acceptor implements Runnable {

	private volatile boolean isRunning = true;

	public Acceptor() {

	}

	public void setRunning(boolean isRunning) {
		this.isRunning = isRunning;
	}

	@Override
	public void run() {
		while (isRunning) {

		}
	}

	private void doAccept() {

	}

	private void doRead() {

	}

	private void doWrite() {

	}

	private void doClose() {

	}

}
