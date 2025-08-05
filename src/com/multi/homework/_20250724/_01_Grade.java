package com.multi.homework;

public class _01_Grade {

    public static void main(String[] args) {
        int score = 85;
        String grade =
                (score >= 90)? "A":
                (score >= 80)? "B":
                (score >= 70)? "C":
                (score >= 60)? "D":
                (score >= 0)? "f":"";

        System.out.println("점수를 입력하세요: " + score);
        System.out.println("당신의 등급은 " + grade + "입니다.");
    }
}
