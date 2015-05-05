package org.darion.yaphet.java.nio;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {
	public static void main(String[] args) throws IOException {
		System.out.println("Simple Server StartUp");
		
		ServerSocket service = new ServerSocket(8989);

		while (true) {
			Socket socket = service.accept();
			InputStream inputStream = socket.getInputStream();
			OutputStream outputStream = socket.getOutputStream();

			int length = inputStream.read();
			byte[] array = new byte[length];
			System.out.println("Read Bytes : " + inputStream.read(array));
			System.out.println(new String(array));
			inputStream.close();
			outputStream.close();
			socket.close();
		}
	}
}
