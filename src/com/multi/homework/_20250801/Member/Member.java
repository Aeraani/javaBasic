package com.multi.homework._20250801.Member;

public class Member {
    String name;
    int point;

    public Member(String name, int point) {
        this.name = name;
        this.point = point;
    }

    public int getDiscountedPrice(int price){
        return price;
    }

    public void welcomeMessage(){
        System.out.println("안녕하세요 \"/"+ name+ "/\"고객님.");
    }

    public void upgradePint(){
        point+=1000;
    }

    public void upgradePoint(String event){
        System.out.println(event + "포인트 2배 이벤트 당첨");
        point+=2000;
    }

}
