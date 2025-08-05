package practice.chap_03;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        //특수문저, 이스케이프문자 (Escape Sequence, Escape Character, Special Character)
        System.out.println("자바가");
        System.out.println("너무");
        System.out.println("재밌어요");


        // \n : 줄바꿈
        System.out.println("자바가\n너무\n재밌어요");

        // 해물파전 9000원
        // 김치전 8000원
        // 부추전 8000원
        // \t : 탭
        System.out.println("해물파전\t9000원");
        System.out.println("김치전\t8000원");
        System.out.println("부추전\t8000원");

        // \\ : \역슬래시
        System.out.println("c:\\Program Files\\Java");

        // 땅콩이가 "멍멍" 이라고 했어요
        // \" : "큰따옴표
        System.out.println(" 땅콩이가 \"멍멍\"이라고 했어요");

        // 땅콩이가 '야옹' 이라고 했어요
        //\' : '작은 따옴표
        System.out.println(" 땅콩이가 '야옹' 이라고 했어요");

        char c = 'A';
        c='\'';
        System.out.println(c);
    }
}
