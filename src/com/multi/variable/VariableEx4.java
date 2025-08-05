package com.multi.variable;
//클래스=설계도 VariableEx4는 "예시:자동차 만드는 설계도"
//new VariableEx4()는 "그 설계도로 자동차 하나 만든 것"
//자동차 만든 후 "얘를 v라고 부르자"라고 한것
public class VariableEx4 {
    public void byteValue(){
        byte byteGab=10;
        System.out.println("byteValueMethod Call");
    }
    public void shortValue(){
        //bytrGab=20; 메소드 안에서는 지역 변수로 접근 불가
        System.out.println("shortValueMethod Call");
    }
    public static void main(String[] args) { //javac variableEx.4.javs --> VariableEx4.class
        int i=10;
        VariableEx4 v=new VariableEx4(); //v는 VariableEx4 객체를 가리키는 변수(참조변수)이름, 만든 객체를 나중에 여러번 쓰고 싶을 때 이름 붙여줌
        v.byteValue();
        v.shortValue();


    }
}
