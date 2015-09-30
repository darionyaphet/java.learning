package org.darion.yaphet.http;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;

public class HttpServer implements Runnable {

	private String host;
	private int port;
	private ServerSocket serverSocket;

	public HttpServer(String host, int port) {
		this.host = host;
		this.port = port;
	}

	public HttpServer() {
		this("127.0.0.1", 8989);
	}

	public boolean connect() {
		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress(host, port));
		} catch (IOException e) {
			System.out.println(e.getMessage());
			return false;
		}

		return true;
	}

	@Override
	public void run() {
		System.out.println("HTTP Server is Running ... ");
		if (!connect()) {
			System.err.println("Connect Failed .... ");
		}
		
		while (true) {

		}
	}

	public static void main(String[] args) {
		HttpServer server = new HttpServer();
		Thread instance = new Thread(server);
		instance.start();
	}
}
