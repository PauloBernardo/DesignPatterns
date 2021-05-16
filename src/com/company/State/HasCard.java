package com.company.State;

public class HasCard implements ATMState {
    ATMMachine atmMachine;

    public HasCard(ATMMachine atmMachine) {
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
        if (pinEntered == 1234) {
            System.out.println("You entered the correct PIN");
            this.atmMachine.setCurrentState(this.atmMachine.getHasPin());
        } else {
            System.out.println("You entered a wrong PIN. Try again.");
        }
    }

    @Override
    public void requestCash(int cashToWithdraw) {
        System.out.println("You have to entered your PIN first.");
    }
}
