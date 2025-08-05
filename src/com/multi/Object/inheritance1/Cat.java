package com.multi.Object.inheritance1;

public class Cat extends Animal{//클래스는 설계도
    public void meow(){
        System.out.println("Cat is meowing");
    }

    @Override  //선조에 있는 메소드만 오버라이드 가능
    public void eat() {
        System.out.println("Cat is eating");
    }
}
