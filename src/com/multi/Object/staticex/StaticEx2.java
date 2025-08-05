package com.multi.Object.staticex;

public class StaticEx2 { //선언부
    static final int value=99; //인스턴스변수 final 쓰면 최종값으로 다른 곳에서 바꿀 수 없다
    int data;
//    public StaticEx2() { //생성자
//        value=100;
//    }
    public void meesage(){//메세지 구현 펑션
        int data=66; //지역변수. 지역변수 초기값은 쓰레기 값 따라서 초기값 부여해줘야 됨
        //this.value=88; final변수는 상수이다. 그러므로 error
        System.out.println(data);
        //value++; 인스턴스변수 초기값 int=0
        this.data=66;
    }
    public static void main(String[] args) {
        new StaticEx2();//data 메모리 heap에 생성
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

    }
}
