package org.darion.yaphet.io;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileExample {
	private static final String PATH = "resource/hamlet.txt";

	public static void main(String[] args) throws IOException {
		RandomAccessFile file = new RandomAccessFile(PATH, "rw");
		file.length();
	}
}
