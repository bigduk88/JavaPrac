package com.javaprac.programersBasic;

public class Car {
    //차는 이름 번호 등을 가지고 있는데 이것을 속성(field)라고 한다.
    //타입 필드명
    String name;
    int number;

    public Car(String nanme) {
        this.name = name;
    }

    public Car() {
//        this.name = "이름 없음";
//        this.number = 0;
        this("이름없음", 0);
    }

    public Car(String name, int number) {
        this.name = name;
        this.number = number;
    }
}
