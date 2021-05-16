package com.company.Decorator;

public class HouseWithPool extends HouseDecorator {
    public HouseWithPool(House tempHouse) {
        super(tempHouse);

        System.out.println("Adding a pool");
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", a pool";
    }


    @Override
    public double getCost() {
        return super.getCost() + 3000;
    }
}
