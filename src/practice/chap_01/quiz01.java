package practice.chap_01;

public class quiz01 {
    public static void main(String[] args) {
        int busNo1 = 1234;
        String busNo2 = "상암08";

        int bus1Time = 3;
        int bus2Time = 5;

        double bus1Distance = 1.5;
        double bus2Distance = 10.8;

        System.out.println(busNo1 + "번 버스");
        System.out.println("약 " + bus1Time + "분 후 도착");
        System.out.println("남은 거리 " + bus1Distance + "km");

        System.out.println(busNo2 + "번 버스");
        System.out.println("약 " + bus2Time + "분 후 도착");
        System.out.println("남은 거리 " + bus2Distance + "km");
    }
}
