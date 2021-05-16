package com.company.Decorator;

public class HouseWithGarden extends HouseDecorator{
    public HouseWithGarden(House tempHouse) {
        super(tempHouse);

        System.out.println("Adding a garden");
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", a garden";
    }


    @Override
    public double getCost() {
        return super.getCost() + 1000;
    }
}
