package com.javaprac.javaPlayGround;

public class Gugudan {
    public static void main(String[] args) {
        // 2단
        System.out.println(2 * 1);
        System.out.println(2 * 2);
        System.out.println(2 * 3);
        System.out.println(2 * 4);
        System.out.println(2 * 5);
        System.out.println(2 * 6);
        System.out.println(2 * 7);
        System.out.println(2 * 8);
        System.out.println(2 * 9);

        for (int i = 1; i <= 9; i++)
            for (int j = 1; j <= 9; j++) {
                System.out.println(i * j);
            }
    }
}
