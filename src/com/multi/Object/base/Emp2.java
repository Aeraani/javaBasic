package com.multi.Object.base;
//Object개념, feild(State는 상태, 상태는 곧 Data)
//field가 메모리에 만들어지면 이런 것 들이 instance라고 합니다.
public class Emp2 {
    private  String name;
    private  int sal;
    private int comm;
    private  String dname;

    public Emp2() { //기본생성자
        this("");
    }

    public Emp2(String name) {
        this(name,0);
    }

    public Emp2(String name, int sal) {
        this(name, sal, 0);
    }

    public Emp2(String name, int sal, int comm) {
        this(name, sal, comm, null);
    }

    public Emp2(String name, int sal, int comm, String dname) {
        this.name = name;
        this.sal = sal;
        this.comm = comm;
        this.dname = dname;
    }

    @Override  //오버라이드 하면 오버로드는 못함
    public String toString() {
        return "Emp2{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", comm=" + comm +
                ", dname='" + dname + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Emp2 emp2= new Emp2("박태란");
        Emp2 emp3= new Emp2("박태란", 5000);
        Emp2 emp4= new Emp2("박태란", 5000, 300);
        Emp2 emp5= new Emp2("박태란", 5000, 300, "인사부");
        System.out.println(emp2.toString());
        System.out.println(emp3.toString());
        System.out.println(emp4.toString());
        System.out.println(emp5.toString());
    }
}
