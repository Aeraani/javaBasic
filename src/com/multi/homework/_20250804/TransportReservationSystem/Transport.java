package com.multi.homework._20250804.TransportReservationSystem;

public abstract class Transport {
    String id;
    int capacity;

    public Transport(String id, int capacity) {
        this.id = id;
        this.capacity = capacity;
    }

    public abstract int reserveSeat();

    public void printStatus(){
        System.out.println(id+" 남은 좌석수: "+capacity);
    }
}
