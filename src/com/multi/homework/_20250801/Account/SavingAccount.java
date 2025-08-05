package com.multi.homework._20250801.Account;

public class SavingAccount extends Account {
    public SavingAccount(int balance, String owner) {
        super(balance, owner);
    }

    @Override
    public void withdraw(int amount) {
        balance -= amount+1000;
        System.out.println("SavingAccount 출금 금액: "+(amount+1000));
    }
}
