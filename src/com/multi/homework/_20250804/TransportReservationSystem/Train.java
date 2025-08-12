package com.multi.homework._20250804.TransportReservationSystem;

public class Tranin extends Transport{
    int occupied;
    public Tranin(String id, int capacity) {
        super(id, capacity);
        this.occupied = 0;
    }

    @Override
    public int reserveSeat() {
        if(occupied<capacity){
            occupied++;
            System.out.println("탑승 완료. 탑승 인원: "+occupied);
            return occupied;
        }else{
            System.out.println("탑승 실패. 남은 좌석 0석");
            return 0;
        }
    }

    @Override
    public void printStatus() {
        System.out.println(id+" 행 기차, 남은 좌석수: "+(capacity-occupied));
    }
}
