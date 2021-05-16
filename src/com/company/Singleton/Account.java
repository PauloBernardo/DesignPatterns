package com.company.Singleton;

public class Account {
    private String id;
    private Client client;
    private float value;

    public Account(String id, Client client, float value) {
        this.id = id;
        this.client = client;
        this.value = value;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getValue() {
        return value;
    }

    private void setValue(float value) {
        this.value = value;
    }

    public synchronized void putMoney(float value) {
        setValue(this.value + value);
    }

    public synchronized void withdrawMoney(float value) throws Exception {
        if (this.value - value < 0) {
            throw new Exception("There is not enough money!");
        } else {
            setValue(this.value - value);
        }
    }
}
