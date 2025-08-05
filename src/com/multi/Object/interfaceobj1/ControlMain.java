package com.multi.Object.interfaceobj1;

public class ControlMain {
    public static void main(String[] args) {
        RemoteControl remoteControl=new Tv();
        remoteControl.turnOn();
        remoteControl=new Radio();
        remoteControl.turnOff();

    }
}
