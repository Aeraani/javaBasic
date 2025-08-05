package practice.chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        // 문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals(s2)); // 문자열 내용이 같으면 true, 다르면 false
        System.out.println(s2.equals("python"));

        // 대소문자 구분 없이 문자열 내용이 같은지 여부 체크
        System.out.println(s2.equalsIgnoreCase("python"));

        // 문자열 비교 심화
        s1 = "1234";  // 벽에 붙은 메모지의 비밀번호 정보 하나만 참고 (참조)
        s2 = "1234";
        System.out.println(s1.equals(s2)); //true (내용 비교)
        System.out.println(s1 == s2); //true (참조)

        s1 = new String("1234"); //(서로 다른 메모지를 손님에게 나눠줌. s1과 s2는 다른 공간의 메모리 사용)
        s2 = new String("1234");
        System.out.println(s1.equals(s2)); //true
        System.out.println(s1 == s2); //false

        //문자열 내용 비교하고싶으면 equals 사용해야됨.
    }
}
