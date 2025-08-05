package com.multi.homework._20250725;

public class _02_ArrayMaxMin {
    public static void main(String[] args) {
        int[] arr = {10, 20, 3, 55, 6};
        System.out.println("최댓값: " + maxprocess(arr));
        System.out.println("최솟값: " + minprocess(arr));
    }

        public static int maxprocess(int []arr) {
            int max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            return max;
        }

        public static int minprocess(int []arr){
            int min=arr[0];
            for(int i=1;i<arr.length;i++){
                if(arr[i]<min){
                min=arr[i];
                }
            }
            return min;
        }
    }

