package com.multi.homework._20250725;

import java.util.Arrays;

public class _06_RemoveDuplicates {
    public static void main(String[] args) {
        int []arr={3, 1, 2, 3, 4, 1};
        Arrays.sort(arr);
        System.out.print(arr[0] + " ");
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]!=arr[i-1]){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
