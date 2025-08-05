package com.multi.Object.arrayclass;

public class BookMain {
    public static void main(String[] args) {
        Book []book={new Book(1,"java이다","유원상","멀티출판사"),
                new Book(2,"html이다","윤승근","멀티출판사"),
                new Book(3,"spring이다","김형섭","멀티출판사"),
                new Book(4,"docker이다","지예린","멀티출판사")
        };

        for(Book b:book){
            System.out.println(b.toString());
        }
    }
}
