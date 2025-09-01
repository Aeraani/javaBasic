package com.multi.homework._20250804.EmployeePaymentSystem;

public class FullTimeEmployee extends Employee implements BonusReceivable {
    int incentive;

    public FullTimeEmployee(String name, int baseSalary) {
        super(name, baseSalary);
        this.incentive=0;
    }

    @Override
    public void setBonus(double bonus) {
        this.incentive+=(int)bonus;
    }

    @Override
    public int calculateSalary() {
        return baseSalary+incentive;

    }

    @Override
    public void printSalarySlip() {
        System.out.println("이름: "+name+", 기본급: "+baseSalary+", 상여금: "+incentive+", 총 지급액: "+calculateSalary());
    }


}
