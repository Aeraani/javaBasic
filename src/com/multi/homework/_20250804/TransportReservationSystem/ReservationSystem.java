package com.multi.homework._20250804.TransportReservationSystem;

public class ReservationSystem {
    Transport[]transport={
            new Bus("4108", 40),
            new Train("용산", 60),
            new Flight("A00574", 120)
    };

    public void reservationOnline(String userId){
        for (Transport t : transport) {
            if (t instanceof OnlineReservable) {
                ((OnlineReservable) t).reserveOnline(userId);
            }
        }
    }
    public void reserveAll() {
        for (Transport t : transport) {
            if (!(t instanceof OnlineReservable)) {
                t.reserveSeat();
            }
        }
    }
    public void printAllStatus() {
        for (Transport t : transport) {
            t.printStatus();
        }
    }
    public static void main(String[] args) {
        ReservationSystem system = new ReservationSystem();

        // 온라인 예약
        system.reservationOnline("박태란");

        // 직접 예약 (버스, 기차)
        system.reserveAll();

        // 전체 상태 출력
        system.printAllStatus();
    }

}
