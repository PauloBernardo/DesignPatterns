package com.company.Singleton;

import java.util.ArrayList;

public class Bank {

    private static Bank bankInstance = null;
    private final ArrayList<Client> clients;
    private final ArrayList<Account> accounts;

    private Bank() {
        clients = new ArrayList<>();
        accounts = new ArrayList<>();
    }

    public static synchronized Bank getBankInstance() {
        if (bankInstance == null) {
            bankInstance = new Bank();
        }
        return bankInstance;
    }

    public void addClient(Client client) throws Exception {
        if (!clients.contains(client)) {
            clients.add(client);
            accounts.add(new Account(client.getGovernment_id(), client, 0));
        } else {
            throw new Exception("Client already exist!");
        }
    }

    private Account getAccountByClient(Client client) throws Exception {
        if (clients.contains(client)) {
            Account account = null;
            for (Account a : accounts) {
                if (a.getClient() == client) {
                    account = a;
                }
            }
            return account;
        } else {
            throw new Exception("Client doesn't exist!");
        }
    }

    private Account getAccountByGovernmentID(String governmentID) throws Exception {
        Client clientFound = null;
        for(Client client: clients) {
            if (client.getGovernment_id().equals(governmentID)) {
                clientFound = client;
            }
        }
        if (clientFound != null) {
            Account account = null;
            for (Account a : accounts) {
                if (a.getClient() == clientFound) {
                    account = a;
                }
            }
            return account;
        } else {
            throw new Exception("Client doesn't exist!");
        }
    }

    public void removeClient(Client client) throws Exception {
        accounts.remove(getAccountByClient(client));
        clients.remove(client);
    }

    public float getAccountValue(Client client) throws Exception {
        Account account = getAccountByClient(client);
        return account.getValue();
    }

    public void putMoney(Client client, float value) throws Exception {
        Account account = getAccountByClient(client);
        account.putMoney(value);
    }

    public void withdrawMoney(Client client, float value) throws Exception {
        Account account = getAccountByClient(client);
        account.withdrawMoney(value);
    }

    public void transferMoney(Client client, float value, String government_id) throws Exception {
        Account accountOrigin = getAccountByClient(client);
        Account accountDestiny = getAccountByGovernmentID(government_id);
        accountOrigin.withdrawMoney(value);
        accountDestiny.putMoney(value);
    }
}
