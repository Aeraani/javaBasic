package com.multi.Object.base;

// 객체는 기능을 갖고있는 데이터이다
// 객체(속성+기능)
// 생성자 (Constructor)
// 생정자의 이름은 클래스 이름과 같다
// 결과형이 없다
// 생성자는 자동호출된다.
public class Person3 {
    private String name; //속성부분
    private int age; //속성부분
    private String address; //속성부분
    public Person3(){ //defaultConstructor //overload "Person3" 이름 같고 인자 다름
        System.out.println("Person3 constructor");
    }
    public Person3(String name) {
        System.out.println("Person3 constructor String name");
    }

    public static void main(String[] args) {
        Person3 p1=new Person3("spring"); // name|age|address

    }
}
