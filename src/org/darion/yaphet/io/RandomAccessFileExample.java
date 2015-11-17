package org.darion.yaphet.io;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileExample {
	private static final String PATH = "resource/random_access.data";

	public static void main(String[] args) throws IOException {
		RandomAccessFile file = new RandomAccessFile(PATH, "rw");
		String name = "darion.yaphet";
		file.writeInt(name.length());
		file.writeChars(name);
		file.writeInt(25);
		file.writeDouble(Math.PI);

		file.seek(0);

		// int nameSize = file.readInt();
		// System.out.println("name : "+file.read);
		// System.out.println();
		// System.out.println();
		// System.out.println();
		
	}
}
