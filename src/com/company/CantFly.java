package com.company;

public class CantFly implements Flies {
    @Override
    public void fly() {
        System.out.println("Can't fly");
    }
}
