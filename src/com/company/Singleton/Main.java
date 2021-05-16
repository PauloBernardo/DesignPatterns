package com.company.Singleton;

public class Main {

    public static void main(String[] args) {
        Client client1 = new Client("Paulo", 21, "31232323");
        Client client2 = new Client("Roberto", 30, "212121");
        Bank bank = Bank.getBankInstance();
        try {
            bank.addClient(client1);
            bank.addClient(client2);
            bank.putMoney(client2, 200);
            bank.putMoney(client1, 200);

            ClientRunnable clientRunnable = new ClientRunnable(client1, "212121");
            ClientRunnable clientRunnable2 = new ClientRunnable(client2, "31232323");

            Thread thread = new Thread(clientRunnable);
            Thread thread2 = new Thread(clientRunnable2);
            thread.start();
            thread2.start();
        } catch (Exception e) {
            System.out.println("An error occurred!");
        }

    }
}
