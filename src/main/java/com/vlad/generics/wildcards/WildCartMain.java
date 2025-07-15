package com.vlad.generics.wildcards;

import com.vlad.generics.wildcards.buisness.JustSayService;
import com.vlad.generics.wildcards.buisness.PeopleService;
import com.vlad.generics.wildcards.domain.IPeople;
import com.vlad.generics.wildcards.domain.Man;
import com.vlad.generics.wildcards.domain.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

public class WildCartMain {


    public static void statMethod(Collection<? extends Man> c1, Collection<? super Man> c2, Collection<?> c3) {
//        c1.add(new Man());
//        c1.add(new Student());
//        c1.add(new Object());
//        Man s1 = (Man) c1.iterator().next();
//
//        c2.add(new Man());
//        c2.add(new Student());
//        c2.add((IPeople) () -> System.out.println("our name is legion"));
//        c2.add(new Object());
//        Student s2 = (Student) c2.iterator().next();
//
//        c3.add(new Man());
//        c3.add(new Student());
//        c3.add(new Object());
//        IPeople s3 = (IPeople) c3.iterator().next();
//
//        c1.remove(0);
//        c2.remove(0);
//        c3.remove(0);
    }


    public static void main(String[] args) {
        JustSayService service = new JustSayService();

        PeopleService<IPeople> peopleService = new PeopleService<>();
        PeopleService<Man> manService = new PeopleService<>();
        PeopleService<Student> studentService = new PeopleService<>();


        Student student = new Student();
        Man studentMan = new Student();
        IPeople studentPeople = new Student();
        Man man = new Man();
        IPeople manPeople = new Man();

////
//        service.justDoSay(peopleService, student);
//        service.justDoSay(/*(PeopleService<IPeople>)*/manService, student);
//        service.justDoSay(studentService, student);
//////
//////
//        service.justDoSay1(peopleService, student);
//        service.justDoSay1(manService, student);
//        service.justDoSay1(studentService, student);
////
//        service.justDoSay2(peopleService, student);
//        service.justDoSay2(manService, student);
//        service.justDoSay2(studentService, student);
//
//
//        service.justDoSay3(peopleService, student);
////        service.justDoSay3(manService, student);
////        service.justDoSay3(studentService, student);
//
//
////        service.justDoSay4(peopleService, student);
////        service.justDoSay4(manService, student);
//        service.justDoSay4(studentService, student);
//
//
//
////        service.justDoSay5(peopleService, student);
//        service.justDoSay5(manService, student);
//        service.justDoSay5(studentService, student);
//
//
//        service.justDoSay6(peopleService, student);
//        service.justDoSay6(manService, student);
//        service.justDoSay6(studentService, student);
//
//
//        service.justDoSay7(peopleService, student);
//        service.justDoSay7(manService, student);
//        service.justDoSay7(studentService, student);


//        List<?> l1 = new ArrayList<>();
//        l1.add(man);
//        l1.add(manPeople);
//        l1.add(student);
//        l1.add(studentPeople);
//        l1.add(studentMan);
//        l1.add(new Object());
//
//        List<? super IPeople> l2 = new ArrayList<>();
//        l2.add(man);
//        l2.add(manPeople);
//        l2.add(student);
//        l2.add(studentPeople);
//        l2.add(studentMan);
//        l2.add(new Object());
//
//        List<? super Man> l3 = new ArrayList<>();
//        l3.add(man);
//        l3.add(manPeople);
//        l3.add(student);
//        l3.add(studentPeople);
//        l3.add(studentMan);
//        l3.add(new Object());
//
//        List<? super Student> l4 = new ArrayList<>();
//        l4.add(man);
//        l4.add(manPeople);
//        l4.add(student);
//        l4.add(studentPeople);
//        l4.add(studentMan);
//        l4.add(new Object());
//
//
//        List<? extends IPeople> l5 = new ArrayList<>();
//        l5.add(man);
//        l5.add(manPeople);
//        l5.add(student);
//        l5.add(studentPeople);
//        l5.add(studentMan);
//        l5.add(new Object());
//
//        List<? extends Man> l6 = new ArrayList<>();
//        l6.add(man);
//        l6.add(manPeople);
//        l6.add(student);
//        l6.add(studentPeople);
//        l6.add(studentMan);
//        l6.add(new Object());
////
//        List<? extends Student> l7 = new ArrayList<>();
//        l7.add(man);
//        l7.add(manPeople);
//        l7.add(student);
//        l7.add(studentPeople);
//        l7.add(studentMan);
//        l7.add(new Object());

        List<Integer> list = new ArrayList<>();
        for (int i = 0 ; i < 100; i++){
            list.add(i);
        }
        System.out.println(list.size());

        list.removeIf(new Predicate<Object>() {
            @Override
            public boolean test(Object val) {
                return Objects.equals(val, 99);
            }
        });

        System.out.println(list.size());
        System.out.println(list.get(0) + " " + list.get(list.size()-1));

    }
}
