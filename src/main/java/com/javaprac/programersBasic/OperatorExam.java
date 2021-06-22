package com.javaprac.programersBasic;

public class OperatorExam {
    public static void main(String[] args) {
        int i1 = -5; // 부호 연산자 - 피연산자 5
        int i2 = +i1; // +는 부호 비트를 유지, -가 음수 양수를 바꿔주는 역할
        int i3 = -i1; //

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);

        int i4 = ++i3; //i3 = i3+1;i
        System.out.println(i4);
        System.out.println(i3);
        int i5 =i3++; //i3 = i3 + 1; ++가 앞에 있으면 더하고 값을 대입, 뒤에 붙어있으면 먼저 값을 대입하고 1을 증가시킴.
        System.out.println(i5);
        System.out.println(i3);

        // 정수 값 끼리의 연산은 정수값을
        int i = 5;
        int j = 2;

        System.out.println(i + j);
        System.out.println(i - j);
        System.out.println(i * j);
        System.out.println(i / (double) j);
        System.out.println(i % j);

    }
}
