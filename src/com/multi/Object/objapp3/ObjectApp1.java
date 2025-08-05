package com.multi.Object.objapp3;

public class ObjectApp1 extends Object implements Cloneable{
    public ObjectApp1() {
        try {
            ObjectApp1 obj = (ObjectApp1) this.clone(); //DownCast
            System.out.println(obj.toString());
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }

    }

    public void appMethod1(){
        Object obj=new String("abc");//UpCasting
        //System.out.println(obj instanceof String);//obj를 StringType으로 downcast가능하면 true
        Object obj2=new Object();
        String str=(String) obj2;
        //System.out.println(str instanceof String);
    }

    public static void main(String[] args) {
        ObjectApp1 obj = new ObjectApp1();
        obj.appMethod1();
    }
}
