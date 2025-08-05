package practice.chapter_04;

public class _05_For {
    public static void main(String[] args) {
        // 반복문 For
        System.out.println("어서오세요. 디올입니다.");
        // 또 다른 손님 들어오면?
        System.out.println("어서오세요. 디올입니다.");
        System.out.println("어서오세요. 디올입니다.");
        System.out.println("어서오세요. 디올입니다.");
        System.out.println("어서오세요. 디올입니다.");
        System.out.println("어서오세요. 디올입니다.");
        // 만약 인사법이 바뀌면?
        System.out.println("환영합니다. 디올입니다.");
        System.out.println("환영합니다. 디올입니다.");
        System.out.println("환영합니다. 디올입니다.");
        System.out.println("환영합니다. 디올입니다.");
        // 만약 매장 이름이 바뀌면?
        System.out.println("어서오세요. 올디입니다.");
        System.out.println("어서오세요. 올디입니다.");
        System.out.println("어서오세요. 올디입니다.");
        System.out.println("어서오세요. 올디입니다.");

        System.out.println("---반복문 사용---");

        // 반목문 사용 for
//        for(int i = 0;선언;i < 10;조건;i++증감) {
//            ...수행 명령...}

        for(int i = 0; i <10; i++){
            //System.out.println("어서오세요, 디올입니다." +i);
            System.out.println("어서옵서, 디올입니다." +i);
        }

        // 짝수만 출력
        for (int i = 0; i < 10; i+=2) {//fori만 적고 엔터
            System.out.println(i);
        }

        // 홀수만 출력
        for (int i = 1; i < 10; i+=2) {
            System.out.print(i);
        }

        System.out.println();

        //거꾸로 숫자 출력
        for (int i = 5; i > 0; i--) {
            System.out.print(i);
        }

        System.out.println();

        // 1부터 10까지의 수들의 합
        int sum = 0;
        for (int i = 1; i <= 10 ; i++) {
            sum += i;
            System.out.println("현재까지 총 합은 " +sum+ "입니다.");
        }
        System.out.println("1부터 10까지의 모든 수의 합은 " +sum+ "입니다.");
    }
}
