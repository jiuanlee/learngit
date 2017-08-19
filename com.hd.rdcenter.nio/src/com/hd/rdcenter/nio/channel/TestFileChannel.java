package com.hd.rdcenter.nio.channel;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;


public class TestFileChannel {

  public static void main(String[] args)  {
    RandomAccessFile aFile = null;
    try {
      aFile = new RandomAccessFile("d:/messages.txt", "rw");
      FileChannel inChannel = aFile.getChannel();

      ByteBuffer buf = ByteBuffer.allocate(48);

      int bytesRead = inChannel.read(buf);
      while (bytesRead != -1) {

        System.out.println("Read " + bytesRead);
        buf.flip();

        while (buf.hasRemaining()) {
          System.out.print((char) buf.get());
        }

        buf.clear();
        bytesRead = inChannel.read(buf);
      }
      aFile.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
    
  }

}
