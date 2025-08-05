package com.multi.homework._20250804.ElectronicDeviceControlSystem;

public abstract class ElectronicDevice {
    String brand;
    boolean power;

    public ElectronicDevice(String brand, boolean power) {
        this.brand = brand;
        this.power = power;
    }

    public void displayInfo() {
        if (power) {
            System.out.println("Power On, 장치가 작동 중입니다.");
        }else{
            System.out.println("Power Off, 장치가 작동하지 않습니다.");
        }

    }
}
