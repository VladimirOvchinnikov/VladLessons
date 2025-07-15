package com.vlad.io;

import java.io.*;
import java.net.ServerSocket;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class MyIo2 {


    public static void main(String[] args) {


        String path = "/home/user/IdeaProjects/VladLesson/src/main/java/com/vlad/io/";


//        try (FileReader fw = new FileReader(path + "aaa.txt")){
//
//            char[] c = new char[25];
//            fw.read(c);
//
//            System.out.println(new String(c));
//
//
//        } catch (IOException e){
//            e.printStackTrace();
//        }


//        try(FileChannel fc = new FileInputStream(path + "aaa.txt").getChannel()){
//            ByteBuffer buffers = ByteBuffer.allocate(5);
//            fc.read(buffers);
//
//            System.out.println(new String(buffers.array()));
//            buffers.clear();
//
//            fc.read(buffers, 5);
//            System.out.println(new String(buffers.array()));
//
//        } catch (IOException e){
//            e.printStackTrace();
//        }

//        File file = new File(path + "www.txt");
//        try {
//            Files.write(file.toPath(), "sssss".getBytes(StandardCharsets.UTF_8));
//            Files.write(file.toPath(), "sssss222".getBytes(StandardCharsets.UTF_8));
////            Files.lines(file.toPath()).forEach(System.out::println);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }


        try {
            final int numberOfIterations = 1000000;
            final String messageToWrite = "This is a test üüüüüüööööö";
            final byte[] messageBytes = messageToWrite.
                    getBytes(StandardCharsets.ISO_8859_1);
            final long appendSize = (long) numberOfIterations * messageBytes.length;
            final RandomAccessFile raf = new RandomAccessFile(path + "aaa.txt", "rw");
            raf.seek(raf.length());
            final FileChannel fc = raf.getChannel();
            final MappedByteBuffer mbf = fc.map(FileChannel.MapMode.READ_WRITE, fc.position(), appendSize);
            fc.close();
            for (int i = 1; i < numberOfIterations; i++) {
                mbf.put(messageBytes);
            }
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
