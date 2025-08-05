package com.multi.homework._20250804.ElectronicDeviceControlSystem;

public class Tv extends ElectronicDevice implements RemoteControllable {
    int level;

    public Tv(String brand, boolean power) {
        super(brand, power);
        this.level=50;

    }

    @Override
    public void displayInfo() {
        if (power) {
            System.out.println("Power On, "+ brand+" Tv가 작동 중입니다.");
        }else{
            System.out.println("Power Off, "+brand+" Tv가 작동하지 않습니다.");
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
        System.out.println("티비 볼륨: "+level);
    }else {
        System.out.println("볼륨은 0~100 사이여야 합니다.");
    }

}
}
