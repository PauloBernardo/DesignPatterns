package com.company;

public class Bird extends Animal{
    public Bird(String name, float weight) {
        super(name, weight, "tweet", new ItFlies());
    }
}
