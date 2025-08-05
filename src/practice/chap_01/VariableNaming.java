package practice.chap_01;

public class VariableNaming {
    public static void main(String[] args) {
        // 변수 이름 짓는 법
        // 1. 저장 할 값에 어울리는 변수 이름
        // 2. 밑줄, 문자, 숫자 사용 가능 (공백 불가)
        // 3. 밑줄 또는 문자로 시작 가능
        // 4. 한 단어 또는 두개 단어 이상 단어의 연속
        // 5. 소문자로 시작, 각 단어의 시작은 대문자
        // 6. 예약어는 사용 불가 (public, int, static 등등)

        // 입국 tls고서(여행)
        String nationality = "korea";
        String firstName = "taeran";
        String lastName = "park";
        String dateOfBirth = "2000-01-29";
        String residentialAddress = "hotel";
        String purposeOfVisit = "trip";
        String flightNo = "12345";
        String _flightNo = "7536";
        int accompany = 2;
        int stay = 5;


        //세관신고
        String item1 ="watch";
        String item2 = "bag";

        int i = 0;
        String s = "";
        String str = "";

        //절대 변하지 않는 상수
        final String CODE = "KR";



        System.out.println();
    }
}
