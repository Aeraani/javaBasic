package com.multi.homework._20250725;

public class _07_RightRotateArray {
        public static void main(String[] args) {
            int[] arr = {10, 20, 30, 40};
            int last = arr[arr.length - 1];

            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = last;

            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }


