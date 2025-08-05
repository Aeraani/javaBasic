package com.multi.Object.inheritance1;

public class AnimalMain {
    public static void main(String[] args) {
//        Dog dog = new Dog();
//        dog.name = "땅콩";
//        dog.eat();
//        dog.bark();

        Animal animal=new Animal();
        Dog dog=new Dog();
        dog.eat();
        Cat cat=new Cat();
        cat.eat();

        Animal animal1=new Dog();
    }
}
