package com.multi.homework._20250804.ZooSystem;

import java.util.ArrayList;

public class Zookeeper {
    ArrayList<Animal> animals;

    public Zookeeper() {
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void printAllAnimalsName(){
        System.out.println("- 모든 동물 이름");
        for (Animal animal : animals) {
            System.out.println(animal.name);
        }
    }

    public void makeAllSounds(){
        System.out.println("- 모든 동물 소리내기");
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }

    public void walkAllWalkable() {
        System.out.println("- 걷는 동물");
        for (Animal a : animals) {
            if (a instanceof Walkable) {
                ((Walkable) a).walk();
            }
        }
    }

    public void swimAllSwimmable() {
        System.out.println("- 수영하는 동물");
        for (Animal a : animals) {
            if (a instanceof Swimmable) {
                ((Swimmable) a).swim(); // 인터페이스로 캐스팅 후 호출
            }
        }
    }

    public static void main(String[] args) {
        Zookeeper z = new Zookeeper();

        z.addAnimal(new Lion());
        z.addAnimal(new Penguin());
        z.addAnimal(new Dolphin());

        z.printAllAnimalsName();
        z.makeAllSounds();
        z.swimAllSwimmable();
        z.walkAllWalkable();}

    }

