package com.multi.Object.collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Stack;
import java.util.Vector;

public class ListEx2 {
    public void listMethodEx1(){
        Vector<String> list1=new Vector<String>(); // ArrayList와 같은List(배열), 동시성 제어 가능
        list1.addElement("hello");
        list1.addElement("world");
        list1.add("Spring");
        for(Object o : list1){
            System.out.println(o);
        }

        System.out.println(

        );
        Iterator iterator=(Iterator) list1.iterator();//이더레이터 호출할 떄 마다 새로운 반복자 객체가 생성
        for(;iterator.hasNext();){
            System.out.println(iterator.next());
        }

        System.out.println();

        Enumeration enumeration=list1.elements();
        while(enumeration.hasMoreElements()){ //hasMoreElements()는 다음 node여부 확인
            System.out.println(enumeration.nextElement()); //현재 element를 반환하고 다음 node로 토스
        }

//        list1.remove("hello");
//        list1.contains("hello");  //객체가 있으면 true  없으면 false  인덱스로 넘어가서 어쩌구저쩌구

    }

    public void listMethodEx2(){
        //Stack
        Stack<String> stack=new Stack<String>();
        //요소 추가
        stack.push("A");
        stack.push("B");
        stack.push("C");

        // 스택 요소 출력
        System.out.println("Stack: " + stack); // Stack: [A, B, C]

        // 맨 위 요소 접근 (삭제하지 않음)
        String topElement = stack.peek();
        System.out.println("Top element: " + topElement); // Top element: C

        // 요소 삭제 및 반환
        String removedElement = stack.pop();
        System.out.println("Removed element: " + removedElement); // Removed element: C

        // 스택 요소 출력
        System.out.println("Stack after pop: " + stack); // Stack after pop: [A, B]

        // 스택이 비어 있는지 확인
        boolean isEmpty = stack.empty();
        System.out.println("Is stack empty? " + isEmpty); // Is stack empty? false

        // 요소 검색
        int position = stack.search("A");
        System.out.println("Position of 'A': " + position); // Position of 'A': 2

        // 모든 요소 꺼내기
//        while (!stack.empty()) {
//            System.out.println("Popped: " + stack.pop());
//        }

        // 스택이 비어 있는지 확인
        System.out.println("Is stack empty? " + stack.empty()); // Is stack empty? true

        System.out.println();

        Stack<String>stack1=new Stack<String>();
        stack1.push("Java");
        stack1.push("Css");
        stack1.push("Html");
        stack1.push("Ajax");
        stack1.push("Spring");
        System.out.println(stack1.peek());
        System.out.println(stack1.search("Spring"));
        System.out.println(stack1.indexOf("Java"));
        System.out.println(stack1.lastIndexOf("Java")); //실제 있는 위치 찾기
    }




    public static void main(String[] args) {
        ListEx2 listEx2 = new ListEx2();
        listEx2.listMethodEx1();
        listEx2.listMethodEx2();
    }
}
