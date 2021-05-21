package com.company.Proxy;

public class ATMProxy implements GetATMData{
    private final GetATMData realATMMachine;

    public ATMProxy(GetATMData realATMMachine) {
        this.realATMMachine = realATMMachine;
    }

    @Override
    public ATMState getATMState() {
        return this.realATMMachine.getATMState();
    }

    @Override
    public double getCashInMachine() {
        return this.realATMMachine.getCashInMachine();
    }
}
