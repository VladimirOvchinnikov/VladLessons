package com.vlad;

import com.vlad.rec.Rec1;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {


        Object object1= new Object();
//        Object object2= new Object();
//        Object object3= new Object();
//        Object object4= new Object();
//        Object object5= new Object();


//        System.out.println(object1.hashCode());
//        System.out.println(object1.hashCode());

//        System.out.println(object2.hashCode());
//        System.out.println(object3.hashCode());
//        System.out.println(object4.hashCode());
//        System.out.println(object5.hashCode());

        class MyClass {

            private Integer f1;
            private Integer f2;
            private Integer f3;

            public MyClass(Integer f1, Integer f2, Integer f3) {
                this.f1 = f1;
                this.f2 = f2;
                this.f3 = f3;
            }

            public void setF1(Integer f1) {
                this.f1 = f1;
            }

            @Override
            public boolean equals(Object o) {
                if (o == null || getClass() != o.getClass()) return false;
                MyClass myClass = (MyClass) o;
                return Objects.equals(f1, myClass.f1) && Objects.equals(f2, myClass.f2) && Objects.equals(f3, myClass.f3);
            }

            @Override
            public int hashCode() {
                return Objects.hash(f1, f2, f3);
            }

            @Override
            public String toString() {
                return "MyClass{" +
                        "f1=" + f1 +
                        ", f2=" + f2 +
                        ", f3=" + f3 +
                        '}';
            }
        }
        MyClass c = new MyClass(1,2,3);
        MyClass c1 = new MyClass(1,2,4);

        System.out.println(c.hashCode());
        c.setF1(100);
        System.out.println(c.hashCode());//вот это поворот!

        System.out.println(c.equals(c));


        System.out.println(c);


    }
}