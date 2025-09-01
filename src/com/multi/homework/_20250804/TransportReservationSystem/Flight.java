package com.multi.homework._20250804.TransportReservationSystem;

public class Flight extends Transport implements OnlineReservable{
    int occupied;
    public Flight(String id, int capacity) {
        super(id, capacity);
        occupied = 0;
    }

    @Override
    public int reserveSeat() {
        if(occupied<capacity){
            occupied++;
            System.out.println("예약 완료. 예약 인원: "+occupied);
            return occupied;
        }else{
            System.out.println("예약 실패. 남은 좌석 0석");
            return 0;
        }
    }

    @Override
    public void printStatus() {
        System.out.println(id+" 비행기, 남은 좌석수: "+(capacity-occupied));
    }

    @Override
    public void reserveOnline(String userId) {
        if (occupied < capacity) {
            occupied++;
            System.out.println(userId + "님, " + id + " 비행기 온라인 예약 완료");
        } else {
            System.out.println("온라인 예약 실패. 남은 좌석 0석");
        }
    }
}
