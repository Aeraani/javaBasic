package com.multi.homework._20250804.ZooSystem;

public class Penguin extends Animal implements Swimmable{
    public Penguin() {
        super("Penguin", 5);

    }

    @Override
    public void makeSound() {
        System.out.println("펭귄 소리 : bray");
    }

    @Override
    public void eat() {
        System.out.println("Penguins eat fish.");
    }

    @Override
    public void swim() {
        System.out.println("펭귄은 바다에서 수영한다.");

    }
}
