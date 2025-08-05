package com.multi.control;

public class ControlEx2 {
    //제어문: if, if else, if elseif else, while, do~while,break, continue, return

    public void loopEx1(){
        for(int i=1;i<=9;i++){
            System.out.println("박태란예쁘다");
        }
          for(int i=1;i<=9;i++); //세미콜론은 종료의 의미/ for 문이 9번 돌고 종료되는 것이 아님
              System.out.println("박태란예쁘다");
          for(int i=1;i<=9;i++)
                System.out.println("박태란예쁘다");
                System.out.println("함영웅멋있다");
    }
//    public void loopEx2(){//다중 for 문
//        for(int i=1; i<=9;i++){
//            for(int j=2;j<=9;j++){
//                System.out.print(j+"*"+i+"="+(i*j)+"\t");
//            }
//            System.out.println();
//        }
//    }
    public void loopEx3(){
        int i=1, j=2;
        while(i<=9){
            while(j<=9){
                System.out.print(j+"*"+i+"="+(i*j)+"\t");
                j++;
            }
            j=2;
            i++;
            System.out.println();
        }

    }
    public static void main(String[] args) {
        ControlEx2 c=new ControlEx2();
        c.loopEx1();
//        c.loopEx2();
        c.loopEx3();
    }
}
