package com.multi.variable;//이 파일이 어떤 폴더(패키지)에 있는지 표시
//변수는 메모리이다
public class variableEx1 { //클래스 이름은 파일명과 같이야 함
    public static void main(String[] args) { //자바 프로그램이 시작되는 곳
//        byte byteValue=10; // byte타입 변수 선언하고 10저장
//        System.out.println(byteValue); //byteValue값 출력
//        int intValue=20; //int타입 변수 선언하고 20저장
//        System.out.println(intValue); //intValue값 출력
//        boolean boolValue=true; //boolean타입 변수 선언하도 true저장
//        System.out.println(boolValue); //booleanValue값 출력

        int userAge = 25; //Camel Case로 명명
        boolean isActive=true; // Boolean 변수명은 is로 시작
        final int MAX_SIZE=100; //상수는 대문자와 언더스코어 사용


        System.out.println("User Age="+userAge);
        System.out.println("User Active="+isActive);
        System.out.println("Max Size="+MAX_SIZE);
    }
}
