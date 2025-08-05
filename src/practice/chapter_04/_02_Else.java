package practice.chapter_04;

public class _02_Else {
    public static void main(String[] args) {
        // 조건문 If Else
        int hour = 15;
        if(hour < 14){ //오후 2시 이전이면
            System.out.println("아아 +1");
        } else{ //그 외의 경우이면
            System.out.println("디카프 아아 +1");
        }
        System.out.println("주문 완#1");

        //오후 2시 이후이거나 모닝커피 마신 경우?
        hour = 10;
        boolean mornigCoffee = false;
        if(hour>=14 || mornigCoffee){ //오후 2시 이후이거나 모닝커피 마신 경우
            System.out.println("디카프 아아 +1");
        }else{
            System.out.println("아아 +1");
        }
        System.out.println("주문 완#2");
    }
}
