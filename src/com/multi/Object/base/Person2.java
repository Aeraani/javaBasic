package com.multi.Object.base;

public class Person2 {
    private  String name;  //인스턴스변수
    private  int age; //인스턴스변수
    private  String address; //인스턴스변수

    public void setName(Person2 this, String name) { //메소드  첫 줄name: 매개변수, 인자, 파라미터
        System.out.println("this="+this);
        this.name = name;  // this는 사물 그 자체.
    }
    public String getName(Person2 this) {
        return this.name;
    }

    public static void main(String[] args) {
        Person2 p1 = new Person2(); //name|age|adress
        Person2 p2 = new Person2(); //name|age|adresss
        System.out.println("p1="+p1);
        System.out.println("p2="+p2);
        p1.setName("지예린");
        p2.setName("박태란");

    }
}
