package com.company.Decorator;

abstract class HouseDecorator implements House{
    protected House tempHouse;


    public HouseDecorator(House tempHouse) {
        this.tempHouse = tempHouse;
    }

    @Override
    public String getDescription() {
        return tempHouse.getDescription();
    }

    @Override
    public double getCost() {
        return tempHouse.getCost();
    }
}
