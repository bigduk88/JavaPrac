package com.javaprac.programersBasic;

import java.util.Scanner;

// Dowhile문은 조건이 맞지 않아도 한 번은 실행된다.
public class DowhileExam {
    public static void main(String[] args) {
        int value = 0;
        Scanner stdIn = new Scanner(System.in);

        do {
            //반복할 문장들
            value = stdIn.nextInt();
            System.out.println("입력 받은 값:" + value);

        } while (value != 10);

        System.out.println("반복문 종료!!");
    }
}
