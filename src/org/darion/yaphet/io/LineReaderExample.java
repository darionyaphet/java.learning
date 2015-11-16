package org.darion.yaphet.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LineReaderExample {
	private static final String PATH = "resource/hamlet.txt";

	public static void main(String[] args) throws IOException {
		String line = null;

		try (BufferedReader reader = new BufferedReader(new FileReader(PATH))) {
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		}
	}
}
