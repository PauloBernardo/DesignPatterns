package com.company.Facade;

public class FundsCheck {
    private double cashInAccount;

    public FundsCheck(double cashInAccount) {
        this.cashInAccount = cashInAccount;
    }

    public double getCashInAccount() {
        return cashInAccount;
    }

    public void decreaseCashInAccount(double cashWithdrawn) {
        cashInAccount -= cashWithdrawn;
    }

    public void increaseCashInAccount(double cashDeposited) {
        cashInAccount += cashDeposited;
    }

    public boolean haveEnoughMoney(double cashToWithdrawal) {
        if(cashToWithdrawal <= getCashInAccount()) {
            return true;
        } else {
            System.out.println("Don't have enough money in account");
            return false;
        }
    }
}
