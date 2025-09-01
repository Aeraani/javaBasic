package com.multi.Object.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UtilEx7 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5); // list 고정데이터로 변환. 추가, 수정, 삭제 불가
        System.out.println(list);
        // list.add(6); error발생, Arrays.asList가 list를 고정데이터로 변환시켜서
        // 요소에 있는 값을 무작위로 섞기
        Collections.shuffle(list);
        System.out.println(list);
        // 역순으로 바꾸기
        Collections.reverse(list);
        System.out.println(list);
        // 최대값/최소값 출력하기
        System.out.println("Max: "+Collections.max(list));
        System.out.println("Min: "+Collections.min(list));
    }
}
