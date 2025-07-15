package com.vlad.polimorh;

import java.util.Arrays;
import java.util.List;

public class Dog implements Animal {
    @Override
    public void scream() {
        System.out.println("woof");
    }


    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        List<Animal> animals = Arrays.asList(dog, cat);

        for (Animal animal : animals) {
            animal.scream();
        }


        Dog dd = (Dog) dog;
    }
}
