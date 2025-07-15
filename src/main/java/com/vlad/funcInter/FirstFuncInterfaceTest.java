package com.vlad.funcInter;

public class FirstFuncInterfaceTest {


    public void method() {
        m(() -> System.out.println("aaaaaaaaaaaaaa"));
    }


    private void m(FirstFuncInterface funcInterface) {
        funcInterface.firstFunc();
    }


    public static void main(String[] args) {
        FirstFuncInterfaceTest test = new FirstFuncInterfaceTest();
        test.method();
    }

}
