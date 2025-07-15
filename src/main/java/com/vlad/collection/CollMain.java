package com.vlad.collection;

import java.util.*;

public class CollMain {

    public static void main(String[] args) {
//        Map<KeyObject, ValueObject> map = new HashMap<>();
//
//        KeyObject kE = new KeyObject("", "");
//
//        KeyObject k1 = new KeyObject("k1", "k1");
//        ValueObject v1 = new ValueObject("v1", "v1");
//
//        map.put(k1, v1);
//        k1.setF1("ddd");
//        System.out.println(map.get(k1));

//        for (Map.Entry<KeyObject, ValueObject> entry : map.entrySet()) {
////            entry.getKey();
////            entry.getValue();
//        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }


//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
////            if (i == 50) {
////                list.remove(i);
////                list.remove(i-1);
//////                list.add(10001);
////            }
//        }

//        for (Integer el : list) {
//            System.out.println(el);
//            list.add(100000);
//        }

        String s = "aaaa";
        String s0 = "aaaa";
        String s1 = new String("aaaa").intern();
        String s2 = new String("aaaa").intern();
//        s = s+"1";

        if (s == s0){
            System.out.println("равны");
        } else {
            System.out.println("не равны");
        }

        if (s == s1){
            System.out.println("равны");
        } else {
            System.out.println("не равны");
        }
        if (s == s2){
            System.out.println("равны");
        } else {
            System.out.println("не равны");
        }

        if (s1 == s2){
            System.out.println("равны");
        } else {
            System.out.println("не равны");
        }

        StringBuilder sb = new StringBuilder();


//        Iterator<Integer> iter = list.iterator();
//        while (iter.hasNext()) {
//            Integer il = iter.next();
//            System.out.println("asdadasdsa " + il);
//
//            iter.remove();
//        }
//        System.out.println(list.size());
//        Integer s = iter.next();
//        System.out.println("asdadasdsa " + s);


//
//        KeyObject k2 = new KeyObject("k2", "k2");
//        ValueObject v2 = new ValueObject("v2", "v2");
//
//        map.put(k2, v2);
//        System.out.println(map.get(k2));
//        System.out.println(map.get(k1));
//        System.out.println(map.size());
//
//        for (int i = 0; i < 100; i++){
//            KeyObject k = new KeyObject("k"+i, "k"+i);
//            ValueObject v = new ValueObject("v"+i, "v"+i);
//            map.put(k, v);
//        }
//        System.out.println(map.size());

//        KeyObject k1_1 = new KeyObject("k1", "k1");
//        System.out.println(map.get(k1_1));
//
//        ValueObject v2 = new ValueObject("v2", "v2");
//        map.put(k1, v2);
//        System.out.println(map.get(k1));
//
//        System.out.println(map.get(kE));
//        System.out.println(map.getOrDefault(kE, new ValueObject("def", "def")));
//
//        System.out.println(map.remove(kE));
//        System.out.println(map.remove(k1));

    }
}
