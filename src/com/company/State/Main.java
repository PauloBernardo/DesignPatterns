package com.company.State;

public class Main {
    public static void main(String[] args) {
        System.out.println("Design Pattern State");

        ATMMachine atmMachine = new ATMMachine(2000);

        atmMachine.insertCard();

        atmMachine.ejectCard();

        atmMachine.insertCard();

        atmMachine.insertPin(1234);

        atmMachine.requestCash(2000);

        atmMachine.insertCard();

        System.out.println("Setting new value to cashInMachine");

        atmMachine.setCashInMachine(2000);

        atmMachine.insertCard();

        atmMachine.insertPin(1234);

        atmMachine.requestCash(500);
    }
}
