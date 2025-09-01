package com.multi.Object.util;

import java.util.*;

//Collection FrameWork
public class UtilEx3 {
    public static void main(String[] args) {
        //선형(배열이 대표적), 비선형
        List<String> list = new ArrayList<String>();  //순서가 있는 선형구조 배열
        list.add("Java");
        list.add("Python");
        list.add("C++");
        System.out.println(list);

        //Set 예제
        Set<Integer> set = new HashSet<Integer>(); //set은 순서 없음 들어간 순서대로 출력되지 않음
        set.add(10);
        set.add(20);
        set.add(20); // 중복 무시
        System.out.println(set);

        //Map 예제 (map많이 쓰면 가독성 떨어짐)
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "딸기");
        map.put(2, "딸기");
        map.put(3, "딸기");
        map.put(4, "딸기");
        System.out.println(map);
        map.put(1, "딸기");
        map.put(2, "딸기");
        map.put(3, "딸기");
        map.put(4, "딸기");
        map.put(4, "수박");
        System.out.println(map);
    }
}
