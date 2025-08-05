package com.multi.homework;
import java.util.Scanner;
public class _02_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("1. 덧셈");
            System.out.println("2. 뺄셈");
            System.out.println("3. 곱셈");
            System.out.println("4. 나눗셈");
            System.out.println("5. 종료");
            System.out.println("번호를 선택하세요");
            int choice = sc.nextInt();

            if(choice == 5){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            if(choice > 5){
                System.out.println("잘못된 선택입니다.");
                break;
            }

            System.out.println("첫 번째 정수를 입력하세요");
            int num1 = sc.nextInt();
            System.out.println("두 번째 정수를 입력하세요");
            int num2 = sc.nextInt();
            System.out.println("첫 번째 정수: " + num1 + "두 번째 정수: " + num2);

            switch (choice){
                case 1:
                    System.out.println("결과: "+ (num1+num2));
                    break;
                case 2:
                    System.out.println("결과: "+ (num1-num2));
                    break;
                case 3:
                    System.out.println("결과: "+ (num1*num2));
                    break;
                default:
                    if(num2 == 0){
                        System.out.println("0으로 나눌 수 없습니다.");
                    }else {
                        System.out.println("결과: "+(num1 / num2));
                        break;
                    }
            }
        }

    }
}
