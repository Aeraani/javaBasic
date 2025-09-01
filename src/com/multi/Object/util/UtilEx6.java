package com.multi.Object.util;

import java.util.Arrays;

public class UtilEx6 {
    public static void main(String[] args) { //Array 예제
        int[] numbers = {3, 1, 4, 1, 5};

        // 정렬
        Arrays.sort(numbers);//1 1 3 4 5 오름차순으로 정렬
        System.out.println("Sorted: " + Arrays.toString(numbers));

        // 이진 검색
        int index = Arrays.binarySearch(numbers, 4); //4가 있는곳 찾기
        System.out.println("Index of 4: " + index);


        // 배열 복사
        int[] copied = Arrays.copyOf(numbers, 7); // 길이 7로 복사
        System.out.println("Copied: " + Arrays.toString(copied));
    }
}
