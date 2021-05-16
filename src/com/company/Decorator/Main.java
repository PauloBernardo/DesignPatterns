package com.company.Decorator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Design Pattern Decorator");

        House house = new HouseWithGarden(new HouseWithPool(new BasicHouse()));

        System.out.println("House's description: " + house.getDescription());
        System.out.println("House's cost: " + house.getCost());
    }
}
