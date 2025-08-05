package com.multi.Object.interfaceobj1;

public class Radio implements RemoteControl, VolumeControl {// 다중상속

    @Override
    public void turnOn() {
        System.out.println("Radio turned On");
    }

    @Override
    public void turnOff() {
        System.out.println("Radio turned Off");
    }

    @Override
    public void volumeUp() {
        System.out.println("Radio volume up");
    }

    @Override
    public void volumeDown() {
        System.out.println("Radio volume down");
    }

    public static void main(String[] args) {

    }
}
