package com.multi.array;

public class ArrayEx2 { // 1차원 배열의 생성, 초기화, 출력 값
    //1차원 배열
    public void arrayApp1(){
        //자료형 []변수명;
        //배열 생성
        int []m1=new int[5]; // [] [] [] [] [] 배열 선언과 동시에 생성
        m1[0]=1;
        m1[1]=2;
        m1[2]=3;
        m1[3]=4;
        m1[4]=5;
        int []m2={1,2,3};
        disp(m2);
        disp(m1);



    }
    public void disp(int[]memory) {
        for (int i = 0; i < memory.length; i++) {
            System.out.println((memory[i]));
        }
        System.out.println();
    }
    public void arrayApp2(){
        String[] m3=new String[3]; //[][][]
        m3[0]="hello";
        m3[1]="world";
        m3[2]="hi";

        for(int i=0;i<m3.length;i++){
            if (m3[i].startsWith("h")){
                System.out.println(m3[i]);
            }
        }
    }
    public static void main(String[] args) {
        ArrayEx2 arrayEx2=new ArrayEx2();
        arrayEx2.arrayApp2();

    }
}
