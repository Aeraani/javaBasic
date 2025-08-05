package com.multi.homework._20250731;

public class Calculator {
    int a;
    int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void add() {
        System.out.println(a+" + "+b+" = "+ (a+b) );
    }

    public void subtract() {
        System.out.println(a+" - "+b+" = "+ (a - b) );
    }

    public static void main(String[] args) {
        Calculator c = new Calculator(10, 5);
        c.add();
        c.subtract();
    }
}
