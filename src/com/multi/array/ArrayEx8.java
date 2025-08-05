package com.multi.array;

public class ArrayEx8 {
    public void disp(int [][]data) {
        for (int i = 0; i < data.length; i++) {
            for (int k = 0; k < data[i].length; k++) {
                System.out.printf("%4d", data[i][k]);
            }
            System.out.println();
        }
        System.out.println();

    }//dispMethod
    public void sum(int [][]x) {

//        x[0][3]+=x[0][0];
//        x[0][3]+=x[0][1];
//        x[0][3]+=x[0][2];
//
//        x[1][3]+=x[1][0];
//        x[1][3]+=x[1][1];
//        x[1][3]+=x[1][2];
//
//        x[2][3]+=x[2][0];
//        x[2][3]+=x[2][1];
//        x[2][3]+=x[2][2];

        final int ROW=4;
        final int COL=4;
        for(int i=0;i<ROW-1;i++ ){ //3행 3열 포문 도는 식
            for(int j=0;j<COL-1;j++ ){
                x[i][COL-1]+=x[i][j];
                x[ROW-1][i]+=x[j][i];
            }
            x[ROW-1][COL-1]+=x[i][i];
        }
    }
    public static void main(String[] args) {
        int [][]m={ // 4행 4열

                {10,20,30,0},

                {40,50,60,0},

                {70,80,90,0},

                {0,0,0,0}
        };
        ArrayEx8 a=new ArrayEx8();
        a.sum(m);
        a.disp(m);
    }
}
