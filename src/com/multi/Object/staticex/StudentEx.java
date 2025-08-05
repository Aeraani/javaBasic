package com.multi.Object.staticex;
//static(정적), final(상수)
public class StudentEx {
    private String name;
    private int age;
    private String email;
    private static String nation;
    static{
        nation="우간다";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void setNation(String nation) {
        StudentEx.nation = nation;
    }
    public String getNation() {
        return StudentEx.nation;
    }

    public static void main(String[] args) {
        StudentEx stud1 = new StudentEx();
        StudentEx stud2 = new StudentEx();
        stud1.setName("지예린");
        stud2.setName("권성민");
        StudentEx.setNation("한국");

        System.out.println(stud1.nation);
        System.out.println(stud2.nation);
        System.out.println(stud1.getName());
        System.out.println(stud2.getName());
    }
}
