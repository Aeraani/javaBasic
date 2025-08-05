package com.multi.homework._20250725;

import org.w3c.dom.ls.LSOutput;

public class _04_ReverseArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};

        System.out.print("");
        for(int i= arr.length-1;i>=0;i--){
            System.out.printf("%2d", arr[i]);
        }
    }

}
