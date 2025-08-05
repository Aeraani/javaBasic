package com.multi.homework._20250801.Vehicle;

import java.sql.Timestamp;

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle[]vehicles={
            new Car("Volvo", 2024),
            new Bus("kia", 2010),
            new Motorcycle("Harly-Davidson", 2021)
        };

        for(Vehicle vehicle:vehicles){
            vehicle.printinfo();
            vehicle.startEngine("000129");
            vehicle.startEngine("박태란", "18시");
        }


    }
}
