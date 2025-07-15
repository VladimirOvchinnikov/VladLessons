package com.vlad.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class MeReflection {


    public static void main(String[] args) {
        MyObject object = new MyObject("1");
//        object.method1();
//        object.stringField;
//        object.objField;

        Class clazz1 = MyObject.class;
        Class clazz2 = object.getClass();
        try {
            Class clazz3 = Class.forName("com.vlad.reflection.MyObject");
            Field[] fields = clazz3.getDeclaredFields();
            for (Field f : fields) {
                System.out.println(f.getName());
            }
            System.out.println("");
            Method[] methods = clazz3.getDeclaredMethods();
            for (Method m : methods) {
                System.out.println(m.getName());
            }

            System.out.println("");

            Constructor[] constructors = clazz3.getDeclaredConstructors();
            for (Constructor c : constructors) {
                System.out.println(c.getName());
            }

            System.out.println("");
//            Method m1 = clazz3.getDeclaredMethod("method2");

//            Annotation[] annotations = m1.getDeclaredAnnotations();
//            System.out.println(annotations[0]);

//            System.out.println(m1.getParameterTypes()[0]);

//            System.out.println(methods[2].getParameterTypes()[0]);



            Constructor[] constructors1 = clazz3.getDeclaredConstructors();
            Constructor pConst = null;
            for (Constructor c : constructors1){
                if (c.getParameters().length == 0){
                    pConst = c;
                    break;
                }
            }
            System.out.println(pConst.getName() + " " + pConst.isVarArgs() + " " +pConst.getModifiers());
            pConst.setAccessible(true);
            Object o = pConst.newInstance();


            Field intField = o.getClass().getDeclaredField("intField");
            System.out.println(intField.getName());
            System.out.println(intField.get(o));
            intField.set(o, 99);
            System.out.println(intField.get(o));

            System.out.println("asdasd");

            Field stringField = o.getClass().getDeclaredField("stringField");
            System.out.println(stringField.getName());
            stringField.setAccessible(true);
            System.out.println(stringField.get(o));
            stringField.set(o, "aaaaaa");
            System.out.println(stringField.get(o));


            Field fField = o.getClass().getDeclaredField("fField");
            System.out.println(fField.getName());
            fField.setAccessible(true);
            System.out.println(fField.get(o));
            fField.set(o, "aaaaaa");
            System.out.println(fField.get(o));

            System.out.println("");

            Method m1 = o.getClass().getDeclaredMethod("method2", Object.class);
            m1.setAccessible(true);
            System.out.println(m1.getName());
            Object res = m1.invoke(o, new Object());
            System.out.println("return " + res);


            System.out.println("");

            Method m2 = o.getClass().getDeclaredMethod("method1");
            m2.setAccessible(true);
            System.out.println(m2.getName());
            Object res1 = m2.invoke(o);
            System.out.println("return " + res1);



//            System.out.println(((MyObject)o).intField);


        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
//        } catch (NoSuchMethodException e) {
//            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }

    }
}
