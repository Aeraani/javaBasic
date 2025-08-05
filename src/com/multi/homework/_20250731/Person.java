package com.multi.homework._20250731;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name=name;
        this.age=age;
    }

    public void introduc(){
        System.out.print("이름: "+name+", 나이: "+age+"살");
    }

    public static void main(String[] args) {

        Person p = new Person("박태란", 26);
        p.introduc();

    }
}
