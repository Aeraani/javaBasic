package com.multi.homework;
import java.util.Scanner;
public class _04_NumberGuessGame {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int answer = 26;
            boolean isCorrect = false;
            int tries = 0;

            while (!isCorrect) {
                System.out.println("숫자를 추측해보세요 (1~100): ");
                int guess = sc.nextInt();
                tries++;

                if (guess == answer) {
                    System.out.println("정답입니다!");
                    break;
                } else if (guess > answer) {
                    System.out.println("더 작은 수입니다.");
                } else {
                    System.out.println("더 큰 수입니다.");
                }
            }

            System.out.println("총 시도한 횟수: " + tries + "번");

        }
    }

