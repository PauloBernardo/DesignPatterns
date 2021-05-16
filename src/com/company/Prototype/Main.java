package com.company.Prototype;

public class Main {
    public static void main(String[] args) {
        System.out.println("Design Prototype");
        CloneFactory animalCloner = new CloneFactory();
        Sheep sally = new Sheep("Dolly is my hero, hehe");
        Dog dog = new Dog("Laika is my hero, bark bark");

        Sheep clonedSheep = (Sheep) animalCloner.getCloneAnimal(sally);
        Dog clonedDog = (Dog) animalCloner.getCloneAnimal(dog);

        System.out.println(sally);
        System.out.println(clonedSheep);

        System.out.println(dog);
        System.out.println(clonedDog);

        System.out.println("Sally: " + System.identityHashCode(sally));
        System.out.println("Cloned: " + System.identityHashCode(clonedSheep));
        System.out.println("Dog: " + System.identityHashCode(dog));
        System.out.println("Cloned Dog: " + System.identityHashCode(clonedDog));
    }
}
