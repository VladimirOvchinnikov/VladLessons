package com.vlad.exceptioni;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class ExceptionMain {


    public static void main(String[] args)  {
//        try {
//            if (false) {
//                throw new MyException();
//            }
//            System.out.println("aaaaaaaaaaaaaa");
//        } catch (MyException e) {
//            System.out.println("MyException");
//        } finally {
//            System.out.println("finally");
//        }
        method1();
    }


    public static void method1()  {

//        try (Scanner s = new Scanner("")) {
//
//        } catch (Exception e){
//
//        }


        try {
//            method2();
            method3();
        } catch (MyException e) {
//            e.printStackTrace();
            System.out.println("Обрабока исключения из другого метода: " + e.getMessage());
//            if (true) {
//                throw new IOException("throw in catch");
//            }
        } finally {
            System.out.println("sssssssssssssss");
        }
        System.out.println("post exit");
    }


    public static void method2() throws MyException {
        if (true) {
            throw new MyException("Руки из жопы");
        }
        System.out.println("Имя мне Легион");
    }


    public static void method3() throws MyException {
        try {
            if (true) {
                System.out.println("pre exit");
                throw new MyException("Руки из жопы");
            }
            System.out.println("aaaaaaaa");
        } finally {
            System.out.println("finally without catch");
        }
    }

}
