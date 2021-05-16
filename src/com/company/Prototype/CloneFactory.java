package com.company.Prototype;

public class CloneFactory {

    public Animal getCloneAnimal(Animal animal) {
        return animal.makeCopy();
    }
}
