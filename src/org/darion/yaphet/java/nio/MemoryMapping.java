package org.darion.yaphet.java.nio;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class MemoryMapping {

	private static final int SIZE = 1024 * 1024;

	public static void main(String[] args) throws IOException {
		RandomAccessFile file = new RandomAccessFile("", "rw");
		FileChannel channel = file.getChannel();
		MappedByteBuffer buffer = channel.map(FileChannel.MapMode.READ_ONLY, 0,
				SIZE);

		channel.close();
	}
}
