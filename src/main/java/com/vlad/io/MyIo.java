package com.vlad.io;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class MyIo {


    public static void main(String[] args) {

        String path = "/home/user/IdeaProjects/VladLesson/src/main/java/com/vlad/io/";

        FileInputStream fis = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        ObjectInputStream ois = null;
        try {
//            fis = new FileInputStream(path + "aaa.txt");
//            System.out.println(fis.available());
//            byte[] b = new byte[fis.available()];
//            System.out.println(fis.read(b));
//            String str = new String(b);
//            System.out.println(str);
//
//            fos = new FileOutputStream(path + "sss.txt");
//            String outputStr = "ssssssssssssssssssa";
//            fos.write('x');
//            fos.write('\n');
//            fos.write(outputStr.getBytes(StandardCharsets.UTF_8));

//            oos = new ObjectOutputStream(new FileOutputStream(path + "ddd.txt"));
//            oos.write("Hello world!".getBytes(StandardCharsets.UTF_8));


//            ois = new ObjectInputStream(new FileInputStream(path + "ddd.txt"));

//            byte[] b = new byte[ois.available()];
//            int i = 0;
//            while (ois.available() > 0) {
//                b[i] = ois.readByte();
//                i++;
//            }
//            System.out.println(new String(b));


//            oos = new ObjectOutputStream(new FileOutputStream(path + "ddd.txt"));
//            oos.writeObject(new MySerialClass(100, "zxcxzcz"));

//            ois = new ObjectInputStream(new FileInputStream(path + "ddd.txt"));
//            Object obj = ois.readObject();
//            System.out.println(obj);


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }




    }


}
