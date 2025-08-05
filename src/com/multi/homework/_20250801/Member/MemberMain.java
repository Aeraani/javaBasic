package com.multi.homework._20250801.Member;

public class MemberMain {
    public static void main(String[] args) {
        Member[]members={
                new SilverMember("박태란",1500),
                new GoldMember("박휘란", 2500),
                new PlatinumMember("박진영", 7000)
        };
        for(Member m:members){
            m.welcomeMessage();
            int price=50000;
            System.out.println("할인 적용 가격: "+m.getDiscountedPrice(price));
            m.upgradePoint("쿨 썸머");
            System.out.println("현재 포인트: " + m.point );
        }
    }
}
