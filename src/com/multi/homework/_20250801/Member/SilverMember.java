package com.multi.homework._20250801.Member;

public class SilverMember extends Member {
    public SilverMember(String name, int point) {
        super(name, point);
    }

    @Override
    public int getDiscountedPrice(int price) {
        return (int)(price*0.90);
    }

    @Override
    public void welcomeMessage() {
        System.out.println("안녕하세요, SilverMember \"/"+ name+ "/\"고객님.");
    }
}
