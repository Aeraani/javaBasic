package com.multi.homework._20250804.EmployeePaymentSystem;


public class HRSystem {
    Employee[] employees = {
            new FullTimeEmployee("박태란", 2800000),
            new PartTimeEmployee("박휘란", 60, 10300),
            new Intern("박진영", 2300000)
    };

    public int calculateTotalSalary() {
        int total=0;
        for (int i = 0; i < employees.length; i++) {
            total+= employees[i].calculateSalary();
        }
        return total;
    }

    public void distributeBonus(double bonus) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] instanceof BonusReceivable) {
                ((BonusReceivable) employees[i]).setBonus(bonus);
            }
        }
    }

    public void printAllSalarySlips(){
        for (int i = 0; i < employees.length; i++) {
            employees[i].printSalarySlip();
        }
    }

    public static void main(String[] args) {
        HRSystem hrSystem = new HRSystem();
        hrSystem.distributeBonus(500000);
        hrSystem.printAllSalarySlips();
        System.out.println("총 급여 합계: "+hrSystem.calculateTotalSalary()+"원");
    }

}
