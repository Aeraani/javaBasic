package com.multi.Object.base;

public class Person1 {
    public String name; //name:속성, 데이터, 필드
    private int age; //age:속성, 데이터, 필드
    public static void main(String[] args) {
//        int x=100; //x는 지역형이면서 프리미티브
//        boolean y=x<=100;
//
//        int []m=new int[5];

        Person1 p1=new Person1(); //메모리 Heap에 name|age 생성 name|age는 데이터(객체) p1은 메모리 stack에 있음
        Person1 p2=new Person1(); //메모리 Heap에 name|age 생성 name|age는 데이터(객체) p2은 메모리 stack에 있음

        p1.name="Java";
        p2.name="C";

        new Person1().age=50;
        System.out.println(new Person1().age); //0
    }

}
