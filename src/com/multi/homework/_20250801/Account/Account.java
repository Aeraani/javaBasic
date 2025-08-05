package com.multi.homework._20250801.Account;

public class Account {
    int balance;
    String owner;

    public Account(int balance, String owner) {
        this.balance = balance;
        this.owner = owner;
    }

    public void diposit(int amount){
        balance += amount;
        System.out.println("입금 금액: "+amount);
    }

    public void diposit(String date, int amount){
        balance += amount;
        System.out.println("입금날짜: "+date+", 입금 금액: "+amount);
    }

    public void withdraw(int amount){
        balance -= amount;
    }

    public void printout(){
        System.out.println(owner + "님 의 계좌 잔액은 "+balance+"원 입니다.");
    }
}
