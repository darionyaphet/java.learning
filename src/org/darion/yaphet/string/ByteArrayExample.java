package org.darion.yaphet.string;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public class ByteArrayExample {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();

        byte[] array = "The quick brown fox jump sover the lazy dog".getBytes();
        ByteBuffer buffer = ByteBuffer.allocate(array.length);
        buffer.put(array);
        buffer.flip();

        Charset charset = Charset.forName("UTF-8");
        char[] chars = charset.decode(buffer).array();
        for (char c : chars) {
            builder.append(c);
            System.out.println(c);
        }
    }
}
