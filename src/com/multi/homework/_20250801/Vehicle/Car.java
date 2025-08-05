package com.multi.homework._20250801.Vehicle;

public class Car extends Vehicle {

    public Car(String name, int year) {
        super(name, year);
            }

    @Override
    public void printinfo() {
        super.printinfo();
        System.out.println("자동차 브랜드: " + brand + ", 연식: "+ year);
    }
}
