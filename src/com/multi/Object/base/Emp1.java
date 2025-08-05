package com.multi.Object.base;
//Constructor, OverLoad
public class Emp1 {
    private  String name;
    private  int sal;
    private  String dname;
// 생성자 영역에 아무것도 없으면 기본 생성자 "public Emp(){}" 있는 것. 생성자 하나라도 생기면 사라짐.
    public Emp1(String name) { //생성자
        this.name = name;
    }

    public Emp1(String name, int sal) {
        this.name = name;
        this.sal = sal;
    }

    public Emp1(String name, int sal, String dname) {
        this.name = name;
        this.sal = sal;
        this.dname = dname;
    }
    public Emp1(Emp1 e){
        this.name=e.name;
        this.sal=e.sal;
        this.dname=e.dname;
    }

    public void disp(Emp1 this){
        System.out.println(this.name+" "+this.sal+" "+this.dname);
    }
    public static void main(String[] args) {
        Emp1 emp1= new Emp1("김재이");
        Emp1 emp2= new Emp1("홍예린", 9000);
        Emp1 emp3= new Emp1("박태란", 10000, "개발부");
        Emp1 emp4= new Emp1(emp3);
        emp4.disp();
    }
}
