package com.javaprac.programersBasic;

public class OperatorExam3 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 15;

        System.out.println(a - b * c);

        System.out.println(a > 5 && b > 5); // 논리 연산자가 비교연산자보다 우선. 둘 다 참이어야 트루.
        System.out.println(a > 5 || b > 5); // 논리 연산자가 비교연산자보다 우선. 하나만 참이어도 트루.

//        System.out.println(++a - 5);
//
//        System.out.println(a);

        System.out.println(a++ - 5);

        System.out.println(a);

    }
}
