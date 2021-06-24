package com.javaprac.programersBasic;

public class AccessObj {
    public int p = 3; // 누구나 접근 가능. 전체 공개.
    protected int p2 = 4; // 같은 패키지나 상속을 받은 경우 접근 허용.
    int k =2 // 디폴트 접근지정자. 자기자신과 같은 패키지에서만 접근가능.
    private int i = 5; // 자기 자신만 접근 가능.

}
