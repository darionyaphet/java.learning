package org.darion.yaphet.java.pipedstream;

import java.io.IOException;
import java.io.PipedOutputStream;

public class PipedWriter implements Runnable {

	private PipedOutputStream outputStream;

	public PipedWriter(PipedOutputStream outputStream) {
		this.outputStream = outputStream;
	}

	@Override
	public void run() {
		System.out.println("Writer Thread Start");
		while (true) {
			String currentTime = System.currentTimeMillis() + "";
			System.out.println("Send : " + currentTime);

			try {
				outputStream.write(currentTime.length());
				outputStream.write(currentTime.getBytes());
				Thread.sleep(1500);
			} catch (IOException e) {
				e.printStackTrace();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
