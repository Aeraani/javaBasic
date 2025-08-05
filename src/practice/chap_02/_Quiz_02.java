package practice.chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {

        int p1 = 115;
        int p2 = 121;
        String ok1 = (p1 >= 120)? "탑승 가능합니다." : "탑승 불가능합니다";
        String ok2 = (p2 >= 120)? "탑승 가능합니다." : "탑승 불가능합니다";
        System.out.println("키가 " + p1 + "cm 이므로 " + ok1);
        System.out.println("키가 " + p2 + "cm 이므로 " + ok2);

    }
}
