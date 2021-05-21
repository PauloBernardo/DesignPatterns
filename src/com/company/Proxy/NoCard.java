package com.company.Proxy;

public class NoCard implements ATMState{
    ATMMachine atmMachine;

    public NoCard(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("Card entered!");
        this.atmMachine.setCurrentState(this.atmMachine.getHasCard());
    }

    @Override
    public void ejectCard() {
        System.out.println("There is no card to eject!");
    }

    @Override
    public void insertPin(int pinEntered) {
        System.out.println("You have to enter a card first");
    }

    @Override
    public void requestCash(int cashToWithdraw) {
        System.out.println("You have to enter a card first.");
    }
}
