package com.company;

public class Main {

    public static void main(String[] args) {
	    Animal animal = new Animal("Dog", 20, "bark");
	    Animal dog = new Dog("Dog2", 16);
	    Animal bird = new Bird("Bird", 2);

	    animal.makeSound();
	    dog.makeSound();
		bird.makeSound();

		animal.tryToFly();
		dog.tryToFly();
		bird.tryToFly();

		Farm farm = new Farm();
		farm.addAnimal(animal);
		farm.addAnimal(dog);
		farm.addAnimal(bird);

		animal.setName("Best friend");
		dog.setWeight(26);
		bird.setSound("tweet tweet");
    }
}
