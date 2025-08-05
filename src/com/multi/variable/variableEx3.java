package com.multi.variable;

public class variableEx3 {
    public static void main(String[] args) {
        System.out.println("Byte Min~Max"+Byte.MIN_VALUE+"~"+Byte.MAX_VALUE);
        System.out.println("Char Min~Max"+Character.MIN_VALUE+"~"+Character.MAX_VALUE);
        System.out.println("Double Min~Max"+Double.MIN_VALUE+"~"+Double.MAX_VALUE);
        System.out.println("Float Min~Max"+Float.MIN_VALUE+"~"+Float.MAX_VALUE);
        System.out.println("Integer Min~Max"+Integer.MIN_VALUE+"~"+Integer.MAX_VALUE);
        System.out.println("Long Min~Max"+Long.MIN_VALUE+"~"+Long.MAX_VALUE);
        System.out.println("Short Min~Max"+Short.MIN_VALUE+"~"+Short.MAX_VALUE);

        byte byteValue=5;
        short shortValue=50;
        //byteValue=shortValue; 큰 바이트에서 작은바이트로 이동 불가!
        shortValue=byteValue; //byte Value가 short Value로 형변환

        //변수 (지역변수, 인스턴스변수, 정적변수)

//        {
//            int x=10;
//            {
//                int y=90;
//                x=99;
//            }
//            y=88;
//        }
//        x=90; //오류나는 이유 x가 있는{}블락스코프 밖으로 멋어난 x이기 때문에 소멸 됨.
    }
}
