package com.javaprac.programersBasic;

public class MyClass2 {
    public int plus(int x, int y) {
        return x + y;
    }

    public int plus(int x, int y, int z) {
        return x + y + z;
    }

    public String plus(String x, String y) {
        return x + y;
    }
    // 메소드 오버로딩. 메소드 이름은 같지만 타입과 매개변수의 수가 다르면 같은 이름으로 메소드를 만들 수 있다.
    // 매개변수의 이름은 중요x. 타입이 중요.

}
