package com.javaprac.programersBasic;

public class LedExam {
    public static void main(String[] args) {
        Tv tv = new LedTv();
        tv.turnOn();
        tv.changeChannel(8);
        tv.changeVolume(39);
        tv.turnOff();
    }
}
