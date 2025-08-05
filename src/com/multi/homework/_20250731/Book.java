package com.multi.homework._20250731;

public class Book {
    String title;
    String author;
    int price;

    public Book() {

    }

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void printInfo(){
        System.out.println("제목: " + title + ", 저자: "+ author + ", 가격: " + price + "원");

    }

    public static void main(String[] args) {
        Book b = new Book("자바의 정석", "남궁성", 30000);
        b.printInfo();
    }

}
