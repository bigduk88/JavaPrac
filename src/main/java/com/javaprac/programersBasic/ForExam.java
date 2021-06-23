package com.javaprac.programersBasic;

public class ForExam {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 1; i <= 100; i++) {
//            if (i % 2 != 0) {
//                continue; // continue를 만나면 아랫 줄을 실행하지 않고 다시 for 시작줄로 돌아가서 i++한 후 실행
//            }

            total += i;
            if (i == 50) {
                break; // 만난 지점부터 반복문을 빠져나옴.
            }
        }
        System.out.println(total);
    }
}
