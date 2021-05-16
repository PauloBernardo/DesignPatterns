package com.company.Singleton;

public class ClientRunnable implements Runnable {
    private final Client client;
    private final String governmentID;

    public ClientRunnable(Client client, String governmentID) {
        this.client = client;
        this.governmentID = governmentID;
    }

    @Override
    public void run() {
        Bank bank = Bank.getBankInstance();

        try {
            while(true) {
                Thread.sleep(2000);
                bank.transferMoney(client, Math.abs((float) (Math.random() * 200)), governmentID);

                System.out.println(client.getName() + " account value: " + bank.getAccountValue(client));
            }
        } catch (Exception e) {
            System.out.println("An error occurred! Client: " + client.getName());
            System.out.println(e.getMessage());
        }
    }
}
