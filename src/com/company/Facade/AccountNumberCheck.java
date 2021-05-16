package com.company.Facade;

public class AccountNumberCheck {
    private final int accountNumber;


    public AccountNumberCheck(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public boolean accountActive(int accountNumber) {
        if (accountNumber == getAccountNumber()) {
            return true;
        } else {
            System.out.println("Account Number is wrong");
            return false;
        }
    }
}
