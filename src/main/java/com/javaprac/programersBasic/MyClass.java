package com.javaprac.programersBasic;

public class MyClass {
    /* 사물 = 상태(field) + 행동(method)
       메소드 = 입력값(매개변수(Parameter): 전달된 인자를 받아들이는 변수를 의미한다, 인자(Argument):어떤 함수를 호출할 때 전달되는 값)
            = 결과값(리턴값)

            public 리턴타입 메소드명 (매개변수 등) {
                필요한 기능 구현
            }
     */

    // 매개변수도 없고 리턴타입도 없는 경우
    public void method1() {
        System.out.println("m1 이 실행됨...");
    }

    // 매개변수는 있고 리턴은 없는 경우
    public void method2(int x) {
        System.out.println(x + "를 이용한 m2 실행...");
    }

    // 매개변수는 없지만 리턴이 있는 경우
    public int method3() {
        System.out.println("m3이 실행됨...");
        return 10;
    }

    // 매개변수 2개 받고 리턴은 없는 경우
    public void method4(int x, int y) {
        System.out.println(x + y + "method4 실행...");
    }

    // 매개변수를 받고 리턴하는 경우
    public int method5(int y) {
        System.out.println(x + "를 이용한 m5실행...");

        return y * 2;
    }
}
