package com.multi.Object.lang;

import org.w3c.dom.ls.LSOutput;

public class StringApp1 {
    int value;

    public StringApp1(int value){
        this.value = value;

    }

    public int strValue(int data){
        data++;
        data*=4;
        return data;

    }
    public static void main(String[] args) {
        String str1=new String("hello");
        String str2=new String("java");
        System.out.println(str1.length());
        System.out.println(str2.length());
        System.out.println(str1);
        StringApp1 s1=new StringApp1(200);
//        s1.strValue(100);
        System.out.println(s1.strValue(100));
        System.out.println(s1.value);
    }
}
