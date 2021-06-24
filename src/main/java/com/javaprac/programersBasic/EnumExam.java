package com.javaprac.programersBasic;

public class EnumExam {
    public static final String MALE="MALE";
    public static final String FEMALE="FEMALE";
    public static void main(String[] args) {
        String gender1;
        gender1 = EnumExam.MALE; //스태틱 필드는 객체생성하지 않고 바로 사용가능
        gender1 = EnumExam.FEMALE;

        gender1 = "boy";

        Gender gender2;
        gender2 = Gender.MALE;
        gender2 = Gender.FEMALE;

//        gender2 = "boy";
    }
}
enum Gender {
    MALE, FEMALE;
}