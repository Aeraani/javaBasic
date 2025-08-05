package com.multi.homework._20250801.Vehicle;

public class Motorcycle extends Vehicle {
    public Motorcycle(String name, int year) {
        super(name, year);
    }

    @Override
    public void printinfo() {
        super.printinfo();
        System.out.println("오토바이 브랜드: "+brand+", 연식: "+year);
    }
}
