package com.company.Decorator;

public class BasicHouse implements House {

    public BasicHouse() {
        System.out.println("Creating a house");
    }

    @Override
    public String getDescription() {
        return "House with 8m²";
    }

    @Override
    public double getCost() {
        return 2000.0;
    }
}
