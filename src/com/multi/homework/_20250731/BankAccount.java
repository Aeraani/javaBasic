package com.multi.homework._20250731;

public class BankAccount {
    String name;
    String accountNumber;
    int balance;

    public BankAccount(String name, String accountNumber, int balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        if (balance > amount) {
            balance -= amount;
        } else {
            System.out.println("잔액이 부족합니다");
        }
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("박태란", "123-456", 750000);
        BankAccount account2 = new BankAccount("박휘란", "456-789", 705000);
        BankAccount account3 = new BankAccount("박진영", "101-112", 800000);
        account1.withdraw(50000);
        account2.withdraw(5000);
        account3.deposit(100000);

        BankAccount[] accounts = {account1, account2, account3};
        int total = 0;
        for (BankAccount acc : accounts) {
            total += acc.balance;
        }
        System.out.println("계좌 잔액 합계: "+total+"원");
    }
}
