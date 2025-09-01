package com.multi.homework._20250804.EmployeePaymentSystem;

public class Intern extends Employee {
    public Intern(String name, int baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public int calculateSalary() {
        return (int)(baseSalary * 0.8);
    }

    @Override
    public void printSalarySlip() {
        int salary=(int)(baseSalary*0.8);
        System.out.println("이름: "+name+", 인턴 급여: "+salary);
    }
}
