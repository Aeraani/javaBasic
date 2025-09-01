package com.multi.Object.collection;

import java.util.*;

public class ListEx1 {
    //ArrayList, Vector, Stack
    public void ListExMethod1() {
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("Html");
        list1.add("Java");
        list1.add("Python");
        list1.add("Ruby");
        System.out.println(list1.toString()); //요소 값들이 하나의 문자열로 출력
        System.out.println(list1.size()); //nodeCount
        System.out.println(list1.get(0));

        System.out.println();

        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));//요소
        }

        System.out.println();

        for (String str : list1) {
            System.out.println(str);
        }

        System.out.println();

        //iterator 는 반복자.
        Iterator<String> iter = list1.iterator();//복자가 있어서 자료구조와 무관하게 데이터를 반복해서 가져옵니다
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        System.out.println(list1.iterator().next());
        System.out.println(list1.iterator().next());
    }

    public void ListExMethod2() {
        ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<String>();
        list1.add("Html");
        list1.add("Java");
        list1.add("Python");
        list1.add("Ruby");
        list1.add(0, "Spring");
        list2.add("llm");
        list2.add("rag");
        list2.add("chain");
        list2.add("bert");
        list1.addAll(list2);
        System.out.println(list1);
    }
        public static void main (String[]args){
            ListEx1 l1 = new ListEx1();
            l1.ListExMethod1();
            l1.ListExMethod2();



        }


}

