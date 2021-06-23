package com.javaprac.programersBasic;

public class ArrayWithFor {
    public static void main(String[] args) {
        int[] iarray = new int[100];
        iarray[0] = 1;
        iarray[1] = 2;
        System.out.println(iarray.length);

        for (int i = 0; i < iarray.length; i++) {
            iarray[i] = i + 1;
        }

        //변수의 스코프는 변수가 선언된 블록이다.
        int sum = 0;
        for (int i = 0; i < iarray.length; i++) {
            sum += iarray[i];
        }
        System.out.println(sum);
    }
}
