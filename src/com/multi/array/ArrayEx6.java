package com.multi.array;

import org.w3c.dom.ls.LSOutput;

public class ArrayEx6 {
    public void createArray(){
        int []m=new int[10];
        for(int i=0;i<m.length;i++){
            m[i]=(int)(Math.random()*100); //*100은 10단위 난수 발생
        }
        disp(m);
        System.out.println("최댓값"+maxprocess(m));
        System.out.println("최솟값"+minprocess(m));
        System.out.println("평균"+getAvg(m)+"이상갯수:"+getAvgMoreCount(m));
    }
    public int maxprocess(int []data){
        int max=data[0];
        for(int i=1;i<data.length;i++){
            if(data[i]>max){
                max=data[i];
            }
        }
        return max;
    }
    public int minprocess(int []data){
        int min=data[0];
        for(int i=1;i<data.length;i++){
            if(data[i]<min){
                min=data[i];
            }
        }
        return min;
    }
    public double getAvg(int[] data){
        int total=0;
        for(int i=0;i<data.length;i++){
            total+=data[i];
        }
        return total/(double)data.length;
    }
    public int getAvgMoreCount(int []data) {
        double avg=getAvg(data);
        int cnt=0;
        for (int i = 0; i < data.length; i++) {
            if(data[i]>avg)cnt++;
        }
        return cnt;
    }
    public void disp(int []x) {
        for (int i : x) {
            System.out.printf("%4d", i);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ArrayEx6 a = new ArrayEx6();
        a.createArray();
    }
}
