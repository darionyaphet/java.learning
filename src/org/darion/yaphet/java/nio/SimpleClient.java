package org.darion.yaphet.java.nio;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class SimpleClient {

	private static final String MESSAGE_STRING = "Hello Darion.Johannes.Yaphet!";

	public static void main(String[] args) throws UnknownHostException,
			IOException {

		Socket socket = new Socket("127.0.0.1", 8989);
		InputStream inputStream = socket.getInputStream();
		OutputStream outputStream = socket.getOutputStream();
		
		outputStream.write(MESSAGE_STRING.length());
		outputStream.write(MESSAGE_STRING.getBytes());
		
		inputStream.close();
		outputStream.close();
		socket.close();
	}
}
