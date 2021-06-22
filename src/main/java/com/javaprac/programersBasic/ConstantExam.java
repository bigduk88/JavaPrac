package com.javaprac.programersBasic;

public class ConstantExam {
    public static void main(String[] args) {
        int i;
        i = 10;
        i = 5;

        final int J; // 상수는 대문자로 정의하는 것이 관례
        J = 10;

//        J = 5;

        double circleArea;
        final double PI = 3.14159;
        circleArea = 3 * 3 * PI;

        final int OIL_PRICE = 1390;

        int totalPrice = 50 * OIL_PRICE;

    }
}
