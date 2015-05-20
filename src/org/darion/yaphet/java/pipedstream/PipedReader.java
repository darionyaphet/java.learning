package org.darion.yaphet.java.pipedstream;

import java.io.IOException;
import java.io.PipedInputStream;

public class PipedReader implements Runnable {

	private PipedInputStream inputStream;

	public PipedReader(PipedInputStream inputStream) {
		this.inputStream = inputStream;
	}

	@Override
	public void run() {
		System.out.println("Reader Thread Start");
		while (true) {
			try {
				int lenght = inputStream.read();
				byte[] byffer = new byte[lenght];
				int readSize = inputStream.read(byffer);
				if (readSize == lenght) {
					System.out.println("Read : " + new String(byffer));
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
