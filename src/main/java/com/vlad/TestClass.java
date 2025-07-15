package com.vlad;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestClass {


    private Integer fieldInteger;
    protected Integer fieldIntegerProt;
    public Integer fieldIntegerPublic;
    Integer fieldIntegerPack;

    private List<String> aa = Arrays.asList("1", "2", "3");
    private Map<String, String> ss = new HashMap<>();

    {
        System.out.println("Block init");
    }

    static {
        System.out.println("Static Block init");
    }

    private static Integer fieldStaticPrivate;

    public TestClass (){
        System.out.println("Contructor");
    }


    {
        System.out.println("Block init 2");
    }

    public static void main(String[] args) {
        new TestClass();
    }

    public TestClass(Integer fieldInteger) {
        this.fieldInteger = fieldInteger;
    }

    public TestClass(Short fieldInteger) {
        this.fieldInteger = Integer.valueOf(fieldInteger);
    }

    public Integer getFieldInteger() {
        return fieldInteger;
    }

    public void setFieldInteger(Integer fieldInteger) {
        this.fieldInteger = fieldInteger;
    }


    private void methodPrivate(){}
    protected void methodProte(){}
    void methodPrivatePack(){}


    public void method(){
        int d =5;
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.printf("11111111111");
            }
        });

        new Thread(() -> {
            System.out.println("aaaaaaaaaaaaa");
        });

        class LocalClass{

            public void methodLocal(){
                if (d==5){
                    System.out.println("zzzzzzzzzzzzzzz");
                }

                if (TestClass.this.fieldInteger == 6){
                    System.out.println("qqqqqqqqqqqqqqqqq");
                }
            }

        };

        InnerClass c = new InnerClass();

    }

    public class InnerClass{
        private Integer fieldInnerClass;


        public void method(){
            if (TestClass.this.fieldInteger == 4){
                System.out.println("vvvvvvvvvvv");
            }
            TestClass.this.fieldInteger = 100;
            TestClass.this.methodPrivate();
            TestClass.fieldStaticPrivate = 5;
        }



    }


    public static class InnerStaticClass{
        private Integer fieldInnerClass;


        public void method(){
//            if (TestClass.this.fieldInteger == 4){
//                System.out.println("vvvvvvvvvvv");
//            }
//            TestClass.this.fieldInteger = 100;
//            TestClass.this.methodPrivate();
            TestClass.fieldStaticPrivate = 5;
        }

    }


}
