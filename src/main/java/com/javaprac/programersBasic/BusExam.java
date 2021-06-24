package com.javaprac.programersBasic;

public class BusExam {
    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.run();
        bus.ppangppang();

        Car car = new Car();
        car.run();
        //car.ppangppang(); 부모클래스는 자식클래스의 매서드를 사용할 수 없다.
    }
}
