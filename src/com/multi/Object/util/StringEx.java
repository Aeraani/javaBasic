package com.multi.Object.util;

public class StringEx {

    private char[]value;

    public StringEx() {//인자 없는 생성자
    }

    public StringEx(char[] value) {//인자 있는 생성자
        this.value = value;
    }

    public char charAt(int index){
        if(index<0||index>=value.length){
            throw new IndexOutOfBoundsException();
        }
        return value[index];
    }

    public int codePointAt(int index){
        if(index<0||index>=value.length){
            throw new IndexOutOfBoundsException();
        }
        return value[index];
    }

    public boolean equals(Object obj){
        if(this==obj)return true;
        if(obj instanceof String){//obj가 선조 레퍼런스니까 obj가 String으로 DownCast가 가능한지
            char[]other=((String)obj).toCharArray();
            if(this.value.length==other.length){
                for(int i=0;i<this.value.length;i++){
                    if(value[i]!= other[i]){
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str=new String("abcd");
        str.charAt(0);
//        System.out.println(str.equals(str));
//        System.out.println(str.equals(99));
        StringEx st=new StringEx("abcd".toCharArray());
//        System.out.println(st.equals(77));
//        System.out.println(st.equals(st));
//        System.out.println(st.equals(str));
        System.out.println(st.equals("ABCD"));
        System.out.println(st.equals("abcd"));
//        System.out.println(st.chatAt(2));
//        System.out.println(st.codePointAt(2));
    }

}
