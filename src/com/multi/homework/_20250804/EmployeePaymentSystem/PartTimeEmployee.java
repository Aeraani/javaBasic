package com.multi.homework._20250804.EmployeePaymentSystem;

public class PartTimeEmployee extends Employee implements BonusReceivable {
    int incentive;
    int workingHours;
    int hourlyWage;
    public PartTimeEmployee(String name, int workingHours, int hourlyWage) {
        super(name, 0);
        this.incentive=0;
        this.workingHours=workingHours;
        this.hourlyWage=hourlyWage;
    }

    @Override
    public void setBonus(double bonus) {
        this.incentive+=(int)bonus;
    }

    @Override
    public int calculateSalary() {
        return (workingHours*hourlyWage)+incentive;
    }

    @Override
    public void printSalarySlip() {
        System.out.println("이름: "+name+", 시급: " + hourlyWage + ", 시간: " + workingHours +
                ", 상여금: " + incentive + ", 총 지급액: " + calculateSalary());
    }
}
