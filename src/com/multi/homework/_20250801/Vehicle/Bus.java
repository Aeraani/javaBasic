package com.multi.homework._20250801.Vehicle;

public class Bus extends Vehicle {
    public Bus(String name, int year) {
        super(name, year);
    }

    @Override
    public void printinfo() {
        super.printinfo();
        System.out.println("버스 브랜드: " + brand + ", 연식: "+ year);
    }
}

