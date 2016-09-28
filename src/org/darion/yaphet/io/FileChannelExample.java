package org.darion.yaphet.io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileChannelExample {
    private static final int SIZE = 128 * 1024;

    public static void main(String[] args) throws FileNotFoundException {
        ByteBuffer buffer = ByteBuffer.allocate(SIZE);

        try (RandomAccessFile file = new RandomAccessFile("/tmp/log", "r");
             FileChannel channel = file.getChannel()) {
            long start = System.currentTimeMillis();
            int counter = 0;
            while (channel.read(buffer) != -1) {
                counter += 1;
                buffer.clear();
            }
            System.out.println(System.currentTimeMillis() - start + "  " + counter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
