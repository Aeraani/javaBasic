package practice.chap_02;

public class _04_Operator4 {
    public static void main(String[] args) {
        //논리 연산자
        boolean choco = true;
        boolean jelly = false;
        boolean soda = false;

        System.out.println( choco || jelly || soda ); //하나라도 true 이면 결과도 true
        System.out.println( choco && jelly && soda ); // 하나라도 false 이면 false, 모두 true 이면 true

        // And 연산
        System.out.println((5>3) && (3>1));
        System.out.println((5<3) && (3>1));

        // Or 연산
        System.out.println((5>3) || (3>1));
        System.out.println((5>3) || (3<1));
        System.out.println((5<3) || (3<1));

        // 논리 부정 연산자 ( true는 false로, false는 true로)
        System.out.println(!true);
        System.out.println(!false);
        System.out.println(! (5==5));
        System.out.println(! (3==5));


    }
}
