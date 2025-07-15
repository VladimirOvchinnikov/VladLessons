package com.vlad.finali;

import java.util.ArrayList;
import java.util.List;

public class TestFinalClass {

    private final Integer INT_FINAL_VAR_1 = 1;
    private final Integer INT_FINAL_VAR;

    {
        INT_FINAL_VAR = 99;
    }

    public void method(Integer var1, final Integer var2) {
        //logic
        if (var1 == 1) {
            var1 = 3;
        }
    }

    public void method1() {
        final var var1 = 1;
//        System.out.println(var1);


        final List<String> list = new ArrayList<>();
        list.add("");
        list.add("1");
        list.remove(0);

//        list = new ArrayList<>();

    }


    public final void method2() {

    }

}
