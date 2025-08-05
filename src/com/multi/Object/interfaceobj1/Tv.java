package com.multi.Object.interfaceobj1;
//class(설계도, 사용자정의 자료형)
//inheritance(상속)
//추상은 상속을 기반으로 부모가 기능을 다 만즐어주는게 아니라 미완성 기능이 들어가있는 것
public class Tv implements RemoteControl,VolumeControl{ //implements 구현하다 다중상속

    @Override
    public void turnOn() {
        System.out.println("Tv turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Tv turned off");
    }

    @Override
    public void volumeUp() {
        System.out.println("Tv volume up");

    }

    @Override
    public void volumeDown() {
        System.out.println("Tv volume down");

    }

    public static void main(String[] args) {

    }
}
