package org.darion.yaphet.java.io;

import java.nio.ByteBuffer;

public class ByteBufferExample {

	private static final String MSG = "Save your heart for someone who cares.";

	public static void main(String[] args) {
		int size = MSG.length() + 4;
		ByteBuffer buffer = ByteBuffer.allocate(size);
		buffer.putInt(MSG.length());
		buffer.put(MSG.getBytes());
	}
}
