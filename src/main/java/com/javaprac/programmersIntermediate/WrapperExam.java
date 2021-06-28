package com.javaprac.programmersIntermediate;

public class WrapperExam {
    public static void main(String[] args) {
        int i = 5;
        Integer i2 = new Integer(5);

        Integer i3 = 5; // 자동으로 형변환 된 상황. 오토박싱. i2=i3 자바 5부터 i3처럼 작성 가능.

        int i4 = i3.intValue();

        int i5 = 13;

    }
}
