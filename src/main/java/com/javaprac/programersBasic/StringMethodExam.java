package com.javaprac.programersBasic;

public class StringMethodExam {
    public static void main(String[] args) {
//        String str = new String("Hello");
        String str = "Hello";
        System.out.println(str.length());
        System.out.println(str.concat(" world"));
        System.out.println(str);
        str = str.concat(" world");
        System.out.println(str);

        System.out.println(str.substring(3));
        System.out.println(str.substring(3, 7));
    }
}