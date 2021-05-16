package com.company.Prototype;

public class Dog implements Animal {
    private final String message;

    public Dog (String message) {
        this.message = message;
        System.out.println("Dog is made");
    }


    @Override
    public Animal makeCopy() {
        System.out.println("Dog is being made");

        Dog sheepObject = null;

        try {
            sheepObject = (Dog) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return sheepObject;
    }


    public String toString() {
        return message;
    }
}
