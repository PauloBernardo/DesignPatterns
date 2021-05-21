package com.company.Proxy;

public class ATMMachine implements GetATMData {
    private final ATMState hasCard;
    private final ATMState hasPin;
    private final ATMState noCard;
    private final ATMState noCash;

    ATMState currentState;

    private double cashInMachine;

    public ATMMachine(double cashInMachine) {
        hasCard = new HasCard(this);
        hasPin = new HasPin(this);
        noCard = new NoCard(this);
        noCash = new NoCash(this);

        this.cashInMachine = cashInMachine;

        if (this.cashInMachine > 0) {
            currentState = noCard;
        } else {
            currentState = noCash;
        }
    }

    void setCurrentState(ATMState atmState) {
        this.currentState = atmState;
    }

    void setCashInMachine(double cashInMachine) {
        this.cashInMachine = cashInMachine;

        if (this.cashInMachine <= 0) {
            currentState = noCash;
        } else if (currentState == noCash) {
            currentState = noCard;
        }
    }

    @Override
    public ATMState getATMState() {
        return this.currentState;
    }

    public double getCashInMachine() {
        return this.cashInMachine;
    }

    public void insertCard() {
        this.currentState.insertCard();
    }

    public void ejectCard() {
        this.currentState.ejectCard();
    }

    public void insertPin(int pinEntered) {
        this.currentState.insertPin(pinEntered);
    }

    public void requestCash(int cashToWithdraw) {
        this.currentState.requestCash(cashToWithdraw);
    }


    public ATMState getHasCard() {
        return hasCard;
    }

    public ATMState getHasPin() {
        return hasPin;
    }

    public ATMState getNoCard() {
        return noCard;
    }

    public ATMState getNoCash() {
        return noCash;
    }
}
