package com.multi.homework._20250801.Member;

public class GoldMember extends Member {
    public GoldMember(String name, int point) {
        super(name, point);
    }

    @Override
    public int getDiscountedPrice(int price) {
        return (int)(price*0.80);
    }

    @Override
    public void welcomeMessage() {
        System.out.println("안녕하세요, GoldMember \"/"+ name+ "/\"고객님.");
    }
}
