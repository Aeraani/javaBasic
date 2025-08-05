package com.multi.homework._20250804.ElectronicDeviceControlSystem;

public class Main {
    ElectronicDevice []device={
            new Tv("Samsung",false),
            new Speaker("Marshall", false),
            new Refrigerator("LG", true)
    };

    public void turnOnAll(){
        System.out.println("모든 기기 전원 ON");
        for(ElectronicDevice d:device){if (d instanceof RemoteControllable) {
            ((RemoteControllable) d).turnOn();
        }
            d.displayInfo();
        }
    }

    public void turnOffAll(){
        System.out.println("모든 기기 전원 OFF");
        for(ElectronicDevice d:device){
            if (d instanceof RemoteControllable) {
                ((RemoteControllable) d).turnOff();
            }
            d.displayInfo();
        }
    }

    public void setVolume(int level){
        for(ElectronicDevice d:device){
            if (d instanceof RemoteControllable) {
                ((RemoteControllable) d).setVolume(level);

            }
        }
    }

    public static void main(String[] args) {
        Main main=new Main();
        main.turnOnAll();
        main.setVolume(70);
        main.turnOffAll();
}
}


//git remote add origin https://github.com/Aeraani/javaBasic.git