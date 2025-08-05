package com.multi.Object.inheritance1;

public class FamilyMain {

    public static void main(String[] args) {
        //GrandFather, Father, Me
//        Me me = new Me();
//        me.sayMe();
//        me.sayFather();
//        me.sayGrandFather();
//        GrandFather gf = (GrandFather)new Father(); //UpCasting
//        ((Father)gf).sayFather(); //DownCasting
//
//        Father father=new Me();
//        ((Me)father).sayMe();
//        Father father = (Father)new GrandFather();
//        father.sayFather();

        GrandFather gf = new Father();
        gf.sayGrandFather();

        Father father = new Me();
        father.sayFather();

        GrandFather grandfather = new Me();
        grandfather.sayGrandFather();
    }
}
