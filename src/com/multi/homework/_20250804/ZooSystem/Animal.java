package com.multi.homework._20250804.ZooSystem;

 public abstract class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void makeSound();

    public void eat(){
        System.out.println("Animal is eating");
    }
}
