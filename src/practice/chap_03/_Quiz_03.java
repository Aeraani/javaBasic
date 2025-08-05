package practice.chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        String girl = "030708-4567890";
        String boy =  "901231-1234567";

        System.out.println(girl.substring(girl.indexOf("0"), girl.indexOf("5")));
        System.out.println(girl.substring(boy.indexOf("9"), boy.lastIndexOf("2")));

        System.out.println(girl.substring(0, 8)); // 0 위치터 8 위치 직전까지
        System.out.println(boy.substring(0, boy.indexOf("-") + 2)); // 0 위치부터 하이픈 위치 +2 직전까지
    }
}
