package exception;

import java.util.Scanner;

public class ExceptionEx2 {
    Scanner scanner = new Scanner(System.in);
    //다형성, 업캐스팅, 다운캐스팅
    public void classCastExceptionExample(Object obj){//Object obj=new String("hello");
        if (obj  instanceof String)
         System.out.println(((String)obj).charAt(0));//downcast 해서 String 메서드 호출
        if(obj instanceof Integer) {
            System.out.println(((Integer) obj).intValue());
        }

    }

    public void illegalArgumentException(){
        System.out.println("Age: ");
        int age=scanner.nextInt();
        if(age<0){
            throw new IllegalArgumentException("나이는 양수만 가능합니다.");
        }
        System.out.println("Age: "+age);
    }

    public static void main(String[] args) {
        ExceptionEx2 e = new ExceptionEx2();
        e.classCastExceptionExample((new String("hello")));
        e.classCastExceptionExample(5);
        Object obj=new String("hello");
        e.illegalArgumentException();
    }
}
