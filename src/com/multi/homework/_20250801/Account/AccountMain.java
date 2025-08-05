package com.multi.homework._20250801.Account;

public class AccountMain {
    public static void main(String[] args) {
        Account[]accounts={
            new SavingAccount(3000000, "박태란"),
            new CheckingAccount(500000, "박태란")
        };

        accounts[0].diposit("2025-08-05", 500000);
        accounts[1].diposit(50000);

        accounts[0].withdraw(250000);
        accounts[1].withdraw(125000);

        for(Account a:accounts){
            a.printout();
        }
    }
}
