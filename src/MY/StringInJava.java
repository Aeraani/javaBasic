package MY;

public class StringInJava {
    public static void main(String[] args) {
        //문자열 생성
        String s1 = "hello";
        String s2 = new String("Hello");
        char[]charArray={'a','b','c','d','e'};
        String s3=new String(charArray);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println();

        //문자열 길이 확인
        String str = "Hello World";
        int length = str.length();
        System.out.println("length: "+length); //11
        System.out.println();

        //문자 추출
        String str1= "Hello";
        char c= str1.charAt(0);
        System.out.println(c); //H

        //문자열 비교
        String str2= "Hello";
        String str3= "hello";
        boolean equals=str2.equals(str3);
        boolean equalsIgnoreCase=str2.equalsIgnoreCase(str3);
        int compareTo=str2.compareTo(str3);
        int compareToIgnoreCase=str2.compareToIgnoreCase(str3);
        System.out.println(equals);
        System.out.println(equalsIgnoreCase);
        System.out.println(compareTo);
        System.out.println(compareToIgnoreCase);




    }
}
