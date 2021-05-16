package com.company.Template;

public class BrazilianHoagie extends Hoagie {
    String[] meatUsed = {"Chicken", "Ham", "Eggs"};
    String[] cheeseUsed = {"Mozzarella"};
    String[] veggiesUsed = {"Lettuce", "Tomatoes", "Onions", "Olive"};
    String[] condimentsUsed = {"Mustard", "Mayo"};

    public void addMeat() {

        System.out.print("Adding the Meat: ");

        for (String meat : meatUsed) {

            System.out.print(meat + ", ");

        }

    }

    public void addCheese() {

        System.out.print("Adding the Cheese: ");

        for (String cheese : cheeseUsed) {

            System.out.print(cheese + ", ");

        }

    }

    public void addVegetables() {

        System.out.print("Adding the Vegetables: ");

        for (String vegetable : veggiesUsed) {

            System.out.print(vegetable + ", ");

        }

    }

    public void addCondiments() {

        System.out.print("Adding the Condiments: ");

        for (String condiment : condimentsUsed) {

            System.out.print(condiment + ", ");

        }

    }
}
