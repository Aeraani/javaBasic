package com.multi.Object.util;

public class UtilEx2 {
    //String, StringBufer, StringBuilder 차이점
    public void stringExecute1(){
    String str1="abc"; //원래는 안되는데 너무 많이써서 됨. 암시적 선언
    String imsi=str1;
    str1+="def";
        System.out.println(str1==imsi);
    }

    public void stringExecute2(){
    StringBuffer sb=new StringBuffer("abc");
    StringBuffer imsi=sb;

    sb.append("def")
            .append("ghi"); //빌드패턴


        System.out.println(sb);
        System.out.println(sb.deleteCharAt(0));
        System.out.println(sb);

        System.out.println(sb==imsi);
    }

    public void stringExecute3(){
        StringBuilder sb=new StringBuilder("abc");
        sb.append("def")
                .append("g");
        System.out.println(sb);
        sb.deleteCharAt(0);
        System.out.println(sb);
    }

    public void stringExecute4(){
        String string=new String("abc");
        string.charAt(0);

        StringBuffer sb=new StringBuffer("abc");
        sb.charAt(0);

        StringBuilder sbu=new StringBuilder("abx");
        sbu.charAt(0);

        CharSequence cs=new String();
        cs.charAt(0);
        cs=new StringBuffer("abc");
        cs.charAt(0);
        cs=new StringBuilder("abc");

    }

    public static void main(String[] args) {
        UtilEx2 utilEx2=new UtilEx2();
        utilEx2.stringExecute1();
        utilEx2.stringExecute2();
        utilEx2.stringExecute3();
        utilEx2.stringExecute4();
    }
}
