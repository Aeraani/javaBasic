package com.multi.array;

//2차원 배욜은 행렬로 되어있다
public class ArrayEx3 {

    //2차원 배열 (행, 열로 구성) 배열은 선형 자료구조의 대표
    public void arrayApp1(){
        int [][]m=new int[2][3]; //2차원 배열 선언과 동시에 생성
        // 2차원 배열의 의미는 행 갯수
        // 열의 주소 .length 열의 갯수
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[i].length;j++){
                m[i][j]=(int)(Math.random()*100);
                System.out.print(m[i][j]+" ");
            }
            System.out.println(Math.random());
        }

        }
    public void arrayApp2(){
        int []xx=new int[5];
        xx[0]=5;
        xx[1]=6;
        (new int[3])[0]=10;
        (new int [3])[1]=40;
        (new int [4][5])[0][1]=20;
    }
    public static void main(String[] args) {
        ArrayEx3 m=new ArrayEx3();
        m.arrayApp1();
    }
}
