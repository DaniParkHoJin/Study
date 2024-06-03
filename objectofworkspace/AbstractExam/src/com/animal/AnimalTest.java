package com.animal;

public class AnimalTest {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		dog.sound();
		
		Cat cat = new Cat();
		cat.sound();
		
		Fish fish = new Fish();
		fish.sound();
		
		// �Ű� ������ ������
		animalSound(new Dog());
		animalSound(new Cat());
		animalSound(new Fish());
	}

	public static void animalSound(Animal animal) {
		animal.sound();
	}

}