package com.multi.homework._20250804.ElectronicDeviceControlSystem;

public class Refrigerator extends ElectronicDevice{

    public Refrigerator(String brand, boolean power) {
        super(brand, power);
    }

    @Override
    public void displayInfo() {
        if (power) {
            System.out.println("Power On, "+ brand+" Refrigerator가 작동 중입니다.");
        }else{
            System.out.println("Power Off, "+brand+" Refrigerator가 작동하지 않습니다.");
        }
    }
}
