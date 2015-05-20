package org.darion.yaphet.java.http;

import java.io.IOException;
import java.net.Socket;

public class HttpCient {

	private String hostname = "127.0.0.1";
	private int port = 8080;
	private Socket socket;

	public HttpCient(String host, int port) {
		this.hostname = host;
		this.port = port;
	}

	public HttpCient(int port) {
		this.port = port;
	}

	public HttpCient() {

	}

	public void open() {
		try {
			socket = new Socket(hostname, port);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

	public boolean isOpen() {
		return true;
	}

	public void put() {

	}

	public void close() {
		try {
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
