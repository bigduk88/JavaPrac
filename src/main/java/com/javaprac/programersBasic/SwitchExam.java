package com.javaprac.programersBasic;

public class SwitchExam {
    public static void main(String[] args) {
        // switch, case, default, break
        // 만난 케이스부터 나머지를 전부 출력. if문처럼 출력하고 싶다면 break 활용.

        int value = 2;

        switch (value) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("그 외 다른 숫자");
        }
        String str = "A";
        switch (str) {
            case "A":
                System.out.println("A");
                break;
            case "B":
                System.out.println("B");
                break;
        }
    }
}
