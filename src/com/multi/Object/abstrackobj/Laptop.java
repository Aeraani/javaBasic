package com.multi.Object.abstrackobj;

public class Laptop extends Device { //public class Laptop extends Device  선조가 자식 랩탑한테 미완성 기능 줌 오버라이드 안하면 자식도 미완성
    //오버라이드 하면 선조에서 못이룬거 자식이 이룸 -> 추상 벗어남

    public Laptop() {
        super();
    }

    @Override
    public void operate() {

    }

    public static void main(String[] args) {
        new Laptop();
    }
}
