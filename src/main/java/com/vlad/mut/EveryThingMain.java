package com.vlad.mut;

import java.util.List;

public class EveryThingMain {

    private  double s;

    public strictfp void ssss(){
        s++;
    }


    public static void main(String[] args) {
        String ind = "a";
//        if (){
//        }else if (){
//        }else if (){
//        }else if (){
//        }else if (){
//        }else if (){
//        }else if (){
//        }else if (){
//        }

//        Integer state = switch (ind) {
//            case "a": {
//                if (toggle()) {
//                    yield 10;
//                } else {
//                    yield -10;
//                }
//            }
//            case "sss": {
//                yield 100;
//            }
//            case "aaaaaaaa": {
//                yield 1000;
//            }
//            default: {
//                yield 1;
//            }
//        };
//
//        System.out.println(state + 10);


//        List
        assert toggle() : "sssssssssssss";
        System.out.println("Aaaaaaaaaaaaa11111111111");

    }



    public static boolean toggle() {
        return false;
    }

    public static String switchReturn(int ind) {
        return switch (ind) {
            case 1: {
                yield "S";
            }
            case 2: {
                yield "D";
            }
            default: {
                yield "F";
            }
        };
    }


    public static void matching1(Object obj) {
        if (obj instanceof Integer) {
            Integer instance = (Integer) obj;
            System.out.println(instance + 1);
        }


        if (obj instanceof Integer instance) {
            System.out.println(instance + 1);
        }


        double s1 =  switch (obj) {
            case Integer i -> i.doubleValue();
            case Float f -> f.doubleValue();
            case String s -> Double.parseDouble(s);
            default -> 0d;
        };
    }
}
