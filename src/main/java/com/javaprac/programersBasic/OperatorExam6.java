package com.javaprac.programersBasic;

public class OperatorExam6 {
    public static void main(String[] args) {
        int b1 = (5 < 4) ? 50 : 40; // 삼항연산자. 괄호 안의 조건이 참이면 50, 거짓이면 40.

        System.out.println(b1);

        int b2 = 0;
        if (5 > 4) {
            b2 = 50;
        } else {
            b2 = 40;
        }
        System.out.println(b2);
    }
}
