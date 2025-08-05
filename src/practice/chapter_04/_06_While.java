package practice.chapter_04;

public class _06_While {
    public static void main(String[] args) {
        //반복문 While
        int distance = 25;  //수영장 레인 길이
        int move = 0; //현재 이동거리

        while (distance > move) { //현재 이동가리가 전체 거리버가 작다는 조건이 참인 동안 반복 수행
            System.out.println("발차기 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move);
            move += 3;
        }
        System.out.println("도착함");

        //무한루프
        move = 0;
        while (distance > move) { //현재 이동가리가 전체 거리버가 작다는 조건이 참인 동안 반복 수행
            System.out.println("발차기 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move);

        }
        System.out.println("도착함");
    }

}
