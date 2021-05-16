package com.company.Facade;

public class BankAccountFacade {
    AccountNumberCheck accountNumberCheck;
    SecurityCodeCheck securityCodeCheck;
    FundsCheck fundsCheck;
    WelcomeToBank welcomeToBank;

    public BankAccountFacade(int newAcctNum, int newSecCode, double initialFunds) {
        welcomeToBank = new WelcomeToBank();
        accountNumberCheck = new AccountNumberCheck(newAcctNum);
        securityCodeCheck = new SecurityCodeCheck(newSecCode);
        fundsCheck = new FundsCheck(initialFunds);
    }

    public void withdrawCash(int accountNumber, int securityCode, double cashToGet) {
        if(accountNumberCheck.accountActive(accountNumber) && securityCodeCheck.isCodeCorrect(securityCode) && fundsCheck.haveEnoughMoney(cashToGet)) {
            fundsCheck.decreaseCashInAccount(cashToGet);
            System.out.println("Transaction WithDraw Complete");
        } else {
            System.out.println("Transaction WithDraw Failed");
        }
    }


    public void depositCash(int accountNumber, int securityCode, double cashToDeposit) {
        if(accountNumberCheck.accountActive(accountNumber) && securityCodeCheck.isCodeCorrect(securityCode)) {
            fundsCheck.increaseCashInAccount(cashToDeposit);
            System.out.println("Transaction Deposit Complete");
        } else {
            System.out.println("Transaction Deposit Failed");
        }
    }
}
