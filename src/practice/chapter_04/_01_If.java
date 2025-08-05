package practice.chapter_04;

public class _01_If {
    public static void main(String[] args) {
        // 제어문 - 조건문 If
        //if (조건)
        //      ...수행할 명령...
        int hour = 15;

        // if문 내에서 하나의 문장을 실행할 때는 {} 생략 가능
        if (hour < 14)
            System.out.println("아이스 아메리카노 +1");

        //if문 내에서 2개 이상의 문장을 실행할 때는 {} 생략 불가
        if (hour < 14) {
            System.out.println("아이스 아메리카노 +1");
            System.out.println("샷추가");
        }
        System.out.println("커피 주문 완료#1");

        // 오후 2시 이전, 모닝커피 마시지 않은 경우?
        hour = 10;
        boolean morningCoffee = false;
        //if (hour < 14 && morningCofee==false) {
        if (hour < 14 && !morningCoffee) {
                System.out.println("아아 1잔");
        }
        System.out.println("주문 완 #2");

        //오후 2시 이후거나 모닝커피 마신 경우?
        hour = 15;
        morningCoffee = true;
        //if (hour >= 14 || morningCoffee==true) {
        if (hour >= 14 || morningCoffee) {
            System.out.println("아아 (디카페인) +1");
        }
        System.out.println("주문 완 #3");

    }
}
