package practice.chapter_04;

public class _03_ElseIf {
    public static void main(String[] args) {
        // 조건문 Elseif
        // 한라봉 에이드 있으면 +1
        // 또는 망고에이드 있으면 +1
        // 또는 아아 +1

        boolean hallabongAde = true;
        boolean mangoJuice = true;

        if (hallabongAde) {
            System.out.println("한라봉에이드 +1");
        }else if (mangoJuice) {
            System.out.println("망고주스 +1");
        }else {
            System.out.println("아아 +1");
        }
        System.out.println("주문 완 #1");

        //else if는 여러번 사용 가능
        hallabongAde = false;
        mangoJuice = false;
        boolean orangeJuice = true;

        if (hallabongAde) {
            System.out.println("한라봉에이드 +1");
        }else if (mangoJuice) {
            System.out.println("망고주스 +1");
        }else if (orangeJuice) {
            System.out.println("오주 +1");
        }else {
            System.out.println("아아 +1");
        }
        System.out.println("주문 완 #2");

        //else는 없어도 가능
        hallabongAde = false;
        mangoJuice = false;
        orangeJuice = false;

        if (hallabongAde) {
            System.out.println("한라봉에이드 +1");
        }else if (mangoJuice) {
            System.out.println("망고주스 +1");
        }else if (orangeJuice) {
            System.out.println("오주 +1");
        }
        System.out.println("주문 완 #3");
    }
}
