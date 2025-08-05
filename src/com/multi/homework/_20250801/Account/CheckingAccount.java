package com.multi.homework._20250801.Account;

public class CheckingAccount extends Account {
    public CheckingAccount(int balance, String owner) {
        super(balance, owner);
    }

    @Override
    public void withdraw(int amount) {
        balance -= (amount+500);
        System.out.println("CheckingAccount 출금 금액: "+(amount+500));
    }
}
