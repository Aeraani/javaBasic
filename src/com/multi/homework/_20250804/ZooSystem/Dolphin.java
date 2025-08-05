package com.multi.homework._20250804.ZooSystem;

public class Dolphin extends Animal implements Swimmable{
    public Dolphin() {
        super("Dolphin", 13);
    }

    @Override
    public void makeSound() {
        System.out.println("돌고래 소리 : whistles");
    }

    @Override
    public void eat() {
        System.out.println("Dolphins eat squid");
    }

    @Override
    public void swim() {
        System.out.println("돌고래는 바다에서 수영한다.");

    }
}
