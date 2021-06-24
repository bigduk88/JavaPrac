package com.javaprac.programersBasic;

// String은 new 연산자를 사용하지 않고 인스턴스를 만들 수 있다.
public class StringExam {
    public static void main(String[] args) {
        String str1 = "Hello"; // 생성됐을 때 메모리중에 상수들이 저장되는 영역에 저장된다.
        String str2 = "Hello"; // 이미 str1이 메모리에 상수로 hello를 만들어두었기 때문에 그것을 가리킴. 같은 인스턴스 사용.

        String str3 = new String("Hello"); // new 연산자를 이용하면 새로운 인스턴스를 힙 영역에 만든다.
        String str4 = new String("Hello"); // new로 만들었기 때문에 같은 문장이지만 다른 인스턴스를 참조한다.

        if(str1 == str2)
            System.out.println("str1과 str2는 같은 레퍼런스 입니다.");

        if(str1 != str3)
            System.out.println("str1과 str3는 다른 레퍼런스 입니다.");

        if(str3 != str4)
            System.out.println("str3과 str4는 다른 레퍼런스 입니다.");

        // String은 한 번 생성된 변수는 변하지 않는다.

        System.out.println(str1);
        System.out.println(str1.substring(3));
        System.out.println(str1);
    }
}
