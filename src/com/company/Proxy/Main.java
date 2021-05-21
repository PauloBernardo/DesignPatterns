package com.company.Proxy;

public class Main {
    public static void main(String[] args) {
        System.out.println("Design Pattern Proxy");

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

        GetATMData realATMMachine = new ATMMachine(2000);

        GetATMData atmProxy = new ATMProxy(realATMMachine);

        System.out.println("\nCurrent ATM State " + atmProxy.getATMState());

        System.out.println("Cash in ATM Machine $" + atmProxy.getCashInMachine());

        try {
            ((ATMMachine) atmProxy).setCashInMachine(2000);
            System.out.println("\nTrying to access harmful method get success with atmProxy");
        } catch (ClassCastException e) {
            System.out.println("\nTrying to access harmful method get error with atmProxy: " + e.getMessage());
        }

        try {
            ((ATMMachine) realATMMachine).setCashInMachine(4000);
            System.out.println("Trying to access harmful method get success with realATMMachine");
        } catch (ClassCastException e) {
            System.out.println("Trying to access harmful method get error with realATMMachine: " + e.getMessage());
        }

    }
}
