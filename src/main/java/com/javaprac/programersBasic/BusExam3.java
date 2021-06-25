package com.javaprac.programersBasic;

public class BusExam3 {
    public static void main(String[] args) {
        Car3 c = new Bus3();
        c.run();

        Bus3 bus3 = (Bus3) c;
        bus3.run();
        bus3.ppangppang();
    }
}
