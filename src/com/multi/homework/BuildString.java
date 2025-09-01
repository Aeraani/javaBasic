package com.multi.homework;

public class BuildString {

    public static String buildString(int count) {
        String result = "";
        for(int i = 0; i < count; i++) {
            result += "a";
        }
        return result;
    }

    public static String buildStringBuffer(int count){
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < count; i++) {
            sb.append("a");
        }
        return sb.toString();
    }

    public static String buildStringBuilder(int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append("a");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int count = 1000000;
        long start, end;


        start = System.nanoTime();
        buildString(count);
        end = System.nanoTime();
        System.out.println("String:        " + (end - start) / 1_000_000.0 + " ms");


        start = System.nanoTime();
        buildStringBuffer(count);
        end = System.nanoTime();
        System.out.println("StringBuffer:  " + (end - start) / 1_000_000.0 + " ms");


        start = System.nanoTime();
        buildStringBuilder(count);
        end = System.nanoTime();
        System.out.println("StringBuilder: " + (end - start) / 1_000_000.0 + " ms");
    }

}

// StringBuilder - StringBuffer - String 순서로 빠름
// String 은 불변으로 매번 새 객체 생성해서 문자열 합치기 떄문에 느림
// StringBuffer는 가변이며 동기화 지원함
// StringBuilder는 가변이며 동기화도 지원하지 않아 가장 빠름