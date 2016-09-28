package org.darion.yaphet.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class FileChannelCopy {
    public static void main(String[] args) {
        try (FileChannel inputChannel = new FileOutputStream("/tmp/log").getChannel();
             FileChannel outputChannel = new FileOutputStream("/tmp/target").getChannel()) {
            long start = System.currentTimeMillis();
            inputChannel.transferTo(0, inputChannel.size(), outputChannel);
            System.out.println(System.currentTimeMillis() - start);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
