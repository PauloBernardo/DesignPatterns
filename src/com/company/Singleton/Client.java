package com.company.Singleton;

public class Client {
    private String name;
    private int age;
    private String government_id;

    public Client(String name, int age, String government_id) {
        this.name = name;
        this.age = age;
        this.government_id = government_id;
    }


    public String getGovernment_id() {
        return government_id;
    }

    public void setGovernment_id(String government_id) {
        this.government_id = government_id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
