package practice.chapter_04;

public class _07_DoWhile {
    public static void main(String[] args) {

        int distance = 25;
        int move = 0;
        int height = 2; //키 2m

        while (distance > move+height) {
            System.out.println("발차기 계속 함");
            System.out.println("현재 이동 거리: "+ move);
            move +=3;
        }
        System.out.println("도착");
        move = 0;
        height = 25;
        while (distance > move+height) {
            System.out.println("발차기 계속 함");
            System.out.println("현재 이동 거리: "+ move);
            move +=3;
        }
        System.out.println("도착");

        //반복문DoWhile
        do{
            System.out.println("발차기 계속 함");
            System.out.println("현재 이동 거리: "+ move);
            move +=3;
        }while(move + height < distance);
        System.out.println("도착");


    }
}
