package com.multi.variable;

public class VariableEx6  {
    public void intValue(int count) {
        for (int i = 1; i <= count; i++) {
            if (i % 7 == 0) System.out.println();
            System.out.print(i + "\t");
        }
    }
    public void byteValue(byte x, byte y){
        float floatValue=(float) 7.0; //7.0은 기본형이 double

    }
    public static void main(String[] args) {
        VariableEx6 variablrEx6=new VariableEx6();
//        variablrEx6.intValue(100);
        variablrEx6.byteValue((byte)5,(byte)7);
    }
}
