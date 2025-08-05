package com.multi.Object.base;

import java.io.BufferedReader;

public class OverLoadingEx2 {
    public void print(int x){
        System.out.println("print int:"+x);
    }
    public void print(long xx){
        System.out.println("print long:"+xx);
    }
    public void print(int x, long xx){
        System.out.println("print int long:");
    }
    public void print(long xx, int x){
        System.out.println("print long int:");
    }

    public static void main(String[] args) {
        OverLoadingEx2 o = new OverLoadingEx2();
        o.print(100);
        o.print(100L);  //L찍으면 강제로 long으로 변환
        //o.print(100, 200);
    }


}
