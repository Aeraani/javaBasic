package com.multi.Object.interfaceobj2;

public interface BasicInterfaceEX1 {
    // interface는 속성이 상수 static final
    public int publicData=100;
    public static void say(){
        System.out.println("interface에서 static method는 사용 가능합니다.");
    }
    //jdk8.0부터 가능
    public static void show(){
        System.out.println("show Merhod");
    }
}
