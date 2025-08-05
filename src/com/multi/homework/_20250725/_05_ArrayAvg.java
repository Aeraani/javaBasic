package com.multi.homework._20250725;

public class _05_ArrayAvg {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        int sum=0;
        double avg = getAvg(arr);
        System.out.println(avg);


//        for(int i=0; i<arr.length; i++){
//            sum+=arr[i];
//        }
//        double avg=(double)sum/arr.length;
//        System.out.println(avg);
    }
    public static double getAvg(int []arr) {
        int total=0;
        for (int i = 0; i < arr.length; i++) {
            total+=arr[i];
        }
        return total/(double)arr.length;

    }
}
