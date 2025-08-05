package exception;
// Exception은 예외(Compile|RunTime)
public class ExceptionEx1 {
    public void nullPointerExceptionExample1(String str){
        //String str=null;
        str=str.charAt(0)!='A'?null:str;
        System.out.println(str.startsWith("Ajax"));
    }
    public void arrayIndexOutOfBoundsExceptionExample1(){
        int[]m=new int[5];
        for(int i=0;i<=5;i++){
            try{//도전 코드 (예외가 나도 실행)
                m[i]=i;
            }catch (ArrayIndexOutOfBoundsException e) {//예외 발생 구간
                System.out.println("ArrayIndexOutOfBoundsException~~");
                e.printStackTrace();
                /*printStackTrace으로 인한 메세지 java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
	at exception.ExceptionEx1.arrayIndexOutOfBoundsExceptionExample1(ExceptionEx1.java:13)
	at exception.ExceptionEx1.main(ExceptionEx1.java:25)*/

            }finally {//꼭
                System.out.println("finally~~~");
            }

        }

    }

    public void arithmeticExceptionExample(){
        int[]m=new int[5];
        int result=0;
        for(int i=0;i<=5;i++){
            try {
                m[i] = (int) Math.random() * 100;
                result = 100 / m[i];
            }catch (ArithmeticException e) {
            }catch (ArrayIndexOutOfBoundsException e) {
            }catch (NullPointerException e) {
            }catch (Exception e) {
            }

        }
    }
    public static void main(String[] args) {
        ExceptionEx1 obj = new ExceptionEx1();
       // obj.nullPointerExceptionExample1("SpringLesson");
        //obj.arrayIndexOutOfBoundsExceptionExample1();
        //obj.arithmeticExceptionExample();


    }
}
