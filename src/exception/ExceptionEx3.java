package exception;

import java.io.IOException;

//try, catch, final
//CompileException
public class ExceptionEx3 implements Cloneable {

    public Object grtData(){
        return 1000;
    }
    public void interruptedException(){
        for(int i=1; i<=1000; i++){
            if(i%5==0) System.out.println();
            try{
                Thread.sleep(100);
                System.out.println("입력: ");
                System.out.println((char) System.in.read());
               this.clone();
            }catch(InterruptedException e){
                e.printStackTrace();
            }catch (IOException e){
                System.out.println(e.getMessage());
            }catch (CloneNotSupportedException e){
                e.printStackTrace();
            }

            System.out.print(i+"\t");
        }
    }
    public static void main(String[] args) {
        ExceptionEx3 ex = new ExceptionEx3();
        ex.interruptedException();
    }
}
