package com.javaprac.programersBasic;

public interface Calculator {
    public int plus(int i, int j);
    public int multiple(int i, int j);

    // 자바 8부터 인터페이스는 default 키워드를 이용하여 메서드 구현이 가능해졌음.
    default int exec(int i, int j) {
        return i + j;
    }

    public static int exec2(int i, int j) {
        return i * j;
    }
}
