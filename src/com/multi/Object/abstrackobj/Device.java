package com.multi.Object.abstrackobj;
//추상클래스는 확장을 목적으로 만들어진 클래스.
public abstract class Device extends Object{
    private String name;
    public Device(){// 기본생성자
        super();
    }
    public Device(String name){
        super();
        this.name = name;
    }
    public void powerOn(){// 메서드
        int data; //지역변수
    }
    public abstract void operate(); // 미완성 메서드

//    public static void main(String[] args) {
//       // new Device();
//    }
}
