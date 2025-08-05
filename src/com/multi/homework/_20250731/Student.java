package com.multi.homework._20250731;

public class Student {
    public String name;
    private int score;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("민수");
        student.setScore(90);
        System.out.println("이름: "+student.getName()+", 점수: "+student.getScore());
    }
}
