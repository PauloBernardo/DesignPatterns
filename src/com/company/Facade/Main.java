package com.company.Facade;

public class Main {
    public static void main(String[] args) {
        System.out.println("Design Pattern Facade");

        BankAccountFacade bankAccountFacade = new BankAccountFacade(12345678, 1234, 1000);

        bankAccountFacade.withdrawCash(12345678, 1234,300);
        bankAccountFacade.withdrawCash(1234, 1234,300);
        bankAccountFacade.withdrawCash(12345678, 1234,1200);
        bankAccountFacade.depositCash(12345678, 1234,500);
        bankAccountFacade.withdrawCash(12345678, 1234,1200);
    }
}
