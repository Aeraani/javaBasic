package com.multi.homework._20250804.ElectronicDeviceControlSystem;

public class Speaker extends ElectronicDevice implements RemoteControllable{
    int level;

    public Speaker(String brand, boolean power) {
        super(brand, power);
        this.level=30;
    }

    @Override
    public void displayInfo() {
        if (power) {
            System.out.println("Power On, "+ brand+" Speaker가 작동 중입니다.");
        }else{
            System.out.println("Power Off, "+brand+" Speaker가 작동하지 않습니다.");
        }
    }

    @Override
    public void turnOn() {
        this.power=true;
    }

    @Override
    public void turnOff() {
        this.power=false;
    }

    @Override
    public void setVolume(int level) {
        if(level>=0&&level<=100){
            this.level=level;
            System.out.println("스피커 볼륨: "+level);
        }else {
            System.out.println("볼륨은 0~100 사이여야 합니다.");
        }

    }
}
