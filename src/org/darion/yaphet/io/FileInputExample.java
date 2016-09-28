package org.darion.yaphet.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputExample {
    private static byte[] BUFFER = new byte[128 * 1024];

    public static void main(String[] args) {
        //try (InputStream inputStream = new FileInputStream("/tmp/log")) {
        try (InputStream inputStream = new BufferedInputStream(new FileInputStream("/tmp/log"))) {
            long start = System.currentTimeMillis();
            int counter = 0;
            while (inputStream.read(BUFFER) != -1) {
                counter += 1;
                BUFFER = new byte[128 * 1024];
            }
            System.out.println(System.currentTimeMillis() - start + "  " + counter);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
