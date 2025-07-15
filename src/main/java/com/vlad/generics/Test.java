package com.vlad.generics;

import java.util.function.BiConsumer;

public class Test<T> {

    private T tField;

    public T gettField() {
        return tField;
    }

    public Test(T tField) {
        this.tField = tField;
    }

    public static void main(String[] args) {
        Test<String> t = new Test<>("123");
        Test t1 = new Test(1);
        Test t2 = new Test("123123");
        Test<Object> t3 = new Test(1);

    }
}
