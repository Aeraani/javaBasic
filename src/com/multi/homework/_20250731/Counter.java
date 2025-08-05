package com.multi.homework._20250731;

public class Counter {
    static int count = 0;

    public Counter(){
        count++;
    }

    public static void main(String[] args) {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        Counter counter3 = new Counter();
        Counter counter4 = new Counter();
        Counter counter5 = new Counter();

        System.out.println("총 객체 수: "+Counter.count);

    }


}
