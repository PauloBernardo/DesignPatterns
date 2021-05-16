package com.company;

import java.util.ArrayList;

public class Farm implements Observer {
    private ArrayList<Animal> animals;


    public Farm () {
        this.animals = new ArrayList<>();
    }

    public void setAnimals(ArrayList<Animal> animals) {
        this.animals = animals;
    }

    public ArrayList<Animal> getAnimals() {
        return this.animals;
    }

    public void addAnimal(Animal animal) {
        animal.register(this);
        this.animals.add(animal);
    }

    public void removeAnimal(Animal animal) {
        animal.unregister(this);
        animals.remove(animal);
    }

    @Override
    public void update(String name, double weight, String sound) {
        System.out.println("An animal has updated: \nName:" + name + "\nWeight: " + weight + "\nSound: " + sound + "\n");
    }
}
