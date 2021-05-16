package com.company.Prototype;

public class Sheep implements Animal {
    private final String message;

    public Sheep(String message) {
        this.message = message;
        System.out.println("Sheep is made");
    }


    @Override
    public Animal makeCopy() {
        System.out.println("Sheep is being made");

        Sheep sheepObject = null;

        try {
            sheepObject = (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return sheepObject;
    }


    public String toString() {
        return message;
    }
}
