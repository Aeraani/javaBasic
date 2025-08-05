package com.multi.Object.staticex;

public class StaticEx1 {
    int inum;
    static int sNum;
    public void increment(StaticEx1 this) {
        int localNum = 0;
        localNum++;//지역변수 증가
        this.inum++;
        StaticEx1.sNum++; //클래스 로딩 시 단 한번만 생성
        System.out.println("local num="+localNum+", inum="+inum+", sNum="+StaticEx1.sNum);
    }

    public static void main(String[] args) {
        StaticEx1 s1 = new StaticEx1();
        StaticEx1 s2 = new StaticEx1();
        s1.increment(); //1 1 1
        s1.increment(); //1 2 2
        s1.increment(); //1 3 3
        s2.increment(); //1 1 4

    }
}
