package com.multi.homework._20250801.Vehicle;

public class Vehicle {
    String brand;
    int year;

    public Vehicle(String brand, int year) {

        this.brand = brand;
        this.year = year;

    }

    public void printinfo(){
        System.out.println("브랜드: " + brand + ", 연식: " + year);
    }

    public void startEngine(){
        System.out.println("기본 시동");
    }
    public void startEngine(String keyCode){
        System.out.println("키코드로 시동: "+keyCode);
            }

    public void startEngine(String driverName, String time){
        System.out.println("운전자 이름: "+driverName + ", 시간 정보: "+time);
            }
}
