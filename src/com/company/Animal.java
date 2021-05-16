package com.company;

import java.util.ArrayList;

public class Animal extends Creature implements Subject {
    private String name;
    private float weight;
    private String sound;
    private Flies animalFly;
    private final ArrayList<Observer> observers;

    public Animal (String name, float weight, String sound) {
        this.name = name;
        this.weight = weight;
        this.sound = sound;
        this.animalFly = new CantFly();
        this.observers = new ArrayList<>();
    }

    public Animal (String name, float weight, String sound, Flies animalFly) {
        this.name = name;
        this.weight = weight;
        this.sound = sound;
        this.animalFly = animalFly;
        this.observers = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
        notifyObserver();
    }

    public void setWeight(float weight) {
        this.weight = weight;
        notifyObserver();
    }

    public float getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
        notifyObserver();
    }

    public void makeSound() {
        System.out.println(this.name + " make sound: " + this.sound);
    }

    public void tryToFly() {
        this.animalFly.fly();
    }

    public void setAnimalFly(Flies animalFly) {
        this.animalFly = animalFly;
    }

    public Flies getAnimalFly() {
        return this.animalFly;
    }

    @Override
    public void register(Observer o) {
        observers.add(o);
    }

    @Override
    public void unregister(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for(Observer observe: observers) {
            observe.update(this.name, this.weight, this.sound);
        }
    }
}
