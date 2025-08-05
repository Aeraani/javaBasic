package com.multi.array;

public class ArrayEx5 {
//    public void add(int x, int y, int z, int k) {
//    }
//    public void add(int x, int y, int z) {
//    }
//    public void add(int x) {
//    }
    public void add(int ...x){ //가변배열
        for(int i:x){
            System.out.printf("%4d", i);
        }
    }
    public static void main(String[] args) {
        ArrayEx5 a= new ArrayEx5();
        a.add(10,20,30);
//        a.add(10,20,30,40);
//        a.add(10,20,30);
//        a.add(10);
    }
}
