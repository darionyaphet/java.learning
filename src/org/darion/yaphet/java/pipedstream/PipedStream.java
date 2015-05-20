package org.darion.yaphet.java.pipedstream;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedStream {

	public static void main(String[] args) throws IOException {

		PipedInputStream inputStream = new PipedInputStream();
		PipedOutputStream outputStream = new PipedOutputStream();
		inputStream.connect(outputStream);

		PipedReader reader = new PipedReader(inputStream);
		PipedWriter writer = new PipedWriter(outputStream);

		Thread readerThread = new Thread(reader);
		Thread writerThread = new Thread(writer);

		readerThread.start();
		writerThread.start();
	}
}
