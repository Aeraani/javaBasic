package com.multi.homework._20250801.Member;

public class PlatinumMember extends Member {
    public PlatinumMember(String name, int point) {
        super(name, point);
    }

    @Override
    public int getDiscountedPrice(int price) {
        return (int)(price * 0.7);
    }

    @Override
    public void welcomeMessage() {
        System.out.println("안녕하세요, PlatinumMember \"/"+ name+ "/\"고객님.");
    }
}
