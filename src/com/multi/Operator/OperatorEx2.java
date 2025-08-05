package com.multi.Operator;

import java.sql.SQLOutput;

//연산자 최우선 (),.(주소 옆에 . 찍으면 주소를 연결해주는 <a>와 같은 연산자), []
public class OperatorEx2 {//클래스(설계도, 사용자정의 자료형)
    public int parentheses(int x, int y, int k){//선언부 파라미터
        System.out.println("parentheses");
        if(++x==--y) //++x는 2, --y는 1 로 거짓이 됨. 따라서 else return 함수로 적용
        return x+y*k;
        else return (x+y)*k;
    } //부르려면 메모리에 로딩이 되어있어야 함
    public void unaryOperator(int x, int y, int k){
        // +,-,++,--,!,~
        int r=++x+-y--+ ++k;
        System.out.println(!(-r!=-k));

    }
    public String arithmeticOperator(int x, int y, int k) {//산술
        if (x++ != --y){
            return "Java";
        }
        else if(x%y==0){
            return "spring";
        }
        return "default";

    }
    public void logicalOperator(int x, int y, int k, int z, int i) {
        //&(and) 둘 다 참이어야 참,|(or) 둘 중 하나라도 참이면 참
        //&,|비트 논리연산자
        //&&, ||일반 논리연산자(조건문 쓸 때)
//        boolean isState=++x >y--;
        //boolean isState=++x >y-- & ++k==z-- & i--==5;
        //x=2 y=1 k=4 z=3 i=4
        //boolean isState=++x >y-- && ++k==z-- && i--==5;
        //x=2 y=1 k=3 z=4 i=5

        boolean isState=++x >y-- || ++k==--z && i--==5;

        System.out.printf("isState=%b x=%d y=%d k=%d z=%d i=%d",isState,x,y,k,z,i);
//        System.out.println(isState+"x="+x+" y="+y+" k="+k+" z="+z+" i="+i);
    }
    //대입연산자
    public void assignOperator() {
        int x=1;
        x+=1; //x=x+1;
        x=x+1;
        System.out.println(x);
        x*=2; //x=x*2;
        System.out.println(x);
        x/=2; //x=x/2;
        System.out.println(x);
    }
    public static void main(String[] args) {
        OperatorEx2 o=new OperatorEx2();
        o.assignOperator();
//        o.logicalOperator(1,2,3,4,5);
//        String rs= o.arithmeticOperator(2,2,3);
//        System.out.println(rs);
//        o.unaryOperator(1,2,3);
//        int rs=o.parentheses(1,2,3);//알규먼트
//        System.out.println("rs="+rs);
    }
}
