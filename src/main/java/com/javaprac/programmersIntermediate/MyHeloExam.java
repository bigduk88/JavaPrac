package com.javaprac.programmersIntermediate;

import java.lang.reflect.Method;

public class MyHeloExam {

    public static void main(String[] args) {
        MyHello hello = new MyHello();

        try {
            Method method = hello.getClass().getDeclaredMethod("hello");

            if (method.isAnnotationPresent(Count100.class)) {
                for (int i = 0; i < 100; i++) {
                    hello.hello();
                }
            } else {
                hello.hello();
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
