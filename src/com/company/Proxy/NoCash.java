package com.company.Proxy;

public class NoCash implements ATMState{
    ATMMachine atmMachine;

    public NoCash(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("Sorry, we don't have money!");
        System.out.println("Card was ejected.");
    }

    @Override
    public void ejectCard() {
        System.out.println("Sorry, we don't have money!");
    }

    @Override
    public void insertPin(int pinEntered) {
        System.out.println("Sorry, we don't have money!");
    }

    @Override
    public void requestCash(int cashToWithdraw) {
        System.out.println("Sorry, we don't have money!");
    }
}
