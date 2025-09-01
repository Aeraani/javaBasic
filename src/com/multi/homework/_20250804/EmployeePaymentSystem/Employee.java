package com.multi.homework._20250804.EmployeePaymentSystem;

public abstract class Employee {
    String name;
    int baseSalary;

     Employee(String name, int baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public abstract int calculateSalary();

     public void printSalarySlip(){
         System.out.println("이름: "+name+" 급여: "+calculateSalary());

     }

}
