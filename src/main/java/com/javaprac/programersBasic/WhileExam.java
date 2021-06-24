package com.javaprac.programersBasic;

// while문은 조건이 맞지 않으면 한 번도 실행되지 않을 수 있다.
public class WhileExam {
    public static void main(String[] args) {
//        int i = 0;
//
//        while (i < 10) {
//            System.out.println(i);
//            i++;
//        }
        int total = 0;
        int i = 1;
        while (i <= 100) {
            total += i;
            i++;
        }
        System.out.println(total);

        // 무한 루프를 사용하고 싶을 때.
        while (true) {
            System.out.println("Hello");
        }
    }
}
