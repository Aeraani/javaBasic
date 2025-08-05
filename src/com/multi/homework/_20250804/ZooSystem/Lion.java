package com.multi.homework._20250804.ZooSystem;

public class Lion extends Animal implements Walkable{
    public Lion() {
        super("Lion", 11);

    }

    @Override
    public void eat() {
        System.out.println("Lions eat meat");
    }

    @Override
    public void makeSound() {
        System.out.println("사자 소리: roar");

    }

    @Override
    public void walk() {
        System.out.println("사자는 네 발로 걷는다.");

    }
}
