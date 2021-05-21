package com.company.Proxy;

public class HasPin implements ATMState {
    ATMMachine atmMachine;

    public HasPin(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("You already inserted a card.");
    }

    @Override
    public void ejectCard() {
        System.out.println("Card was ejected.");
        this.atmMachine.setCurrentState(this.atmMachine.getNoCard());
    }

    @Override
    public void insertPin(int pinEntered) {
        System.out.println("You already entered a PIN");
    }

    @Override
    public void requestCash(int cashToWithdraw) {
        if(cashToWithdraw > this.atmMachine.getCashInMachine()){
            System.out.println("You don't have that much cash available");
            System.out.println("Your card is ejected");
            this.atmMachine.setCurrentState(this.atmMachine.getNoCard());
        } else {
            System.out.println(cashToWithdraw + " is provided by the machine");
            atmMachine.setCashInMachine(this.atmMachine.getCashInMachine() - cashToWithdraw);
            System.out.println("Your card is ejected");
            this.atmMachine.setCurrentState(this.atmMachine.getNoCard());
            if(this.atmMachine.getCashInMachine() <= 0){
                this.atmMachine.setCurrentState(this.atmMachine.getNoCash());
            }
        }
    }

}
