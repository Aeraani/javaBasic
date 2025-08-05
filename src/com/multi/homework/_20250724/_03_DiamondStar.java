package com.multi.homework;

public class _03_DiamondStar {
    public static void main(String[] args) {
        int n= 5;
        int mid=2;
        for (int i = 0; i <= mid; i++) {
            for (int j = 0; j < mid - i; j++) {
                System.out.print(" "); // 공백
            }
            for (int j = 0; j <mid * i + 1; j++) {
                System.out.print("*"); // 별
            }
            System.out.println(); // 줄바꿈
        }
        for (int i=mid-1; i>=0; i--) {
            for (int j = 0; j < mid - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}