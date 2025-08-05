package com.multi.Object.interfaceobj1;

//Interface는 완전 추상클래스 추상들만 옴
// 속성이 final static이다.
//기능만 지정
//설계도이긴 하지만 기능만 만들어놓음
//모든 메서드가 미완성(추상 메서드)인 설계도
//구현 내용 없이 "어떤 기능이 반드시 있어야 한다"는 규약만 정의
public interface RemoteControl { //추상메서드
    public int value=100;
    public abstract void turnOn(); //인터페이ㅣ스는 전부다 추상이기 때문에 abstract 생략 가능
    public void turnOff();
}
