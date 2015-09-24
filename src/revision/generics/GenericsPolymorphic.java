package revision.generics;

import java.util.ArrayList;
import java.util.List;

interface MyInterface {}

abstract class Animal {
	public abstract void eat();
}

class Dog extends Animal implements MyInterface {
	@Override
	public void eat() {
		System.out.println("Eat dog, eat!");
	}
}

class Bird extends Animal {
	@Override
	public void eat() {
		System.out.println("Eat bird, eat!");
	}
}

public class GenericsPolymorphic {

	public static void main(String[] args) {
	
		List<Animal> animals = new ArrayList<Animal>();
		animals.add(new Dog());
		animals.add(new Bird());
		
		List<Dog> dogs = new ArrayList<Dog>();
		dogs.add(new Dog());
		dogs.add(new Dog());
		
		List<Bird> birds = new ArrayList<Bird>();
		birds.add(new Bird());
		birds.add(new Bird());
		
		doAnimalEat(animals);
		doAnimalEat(dogs);
		doAnimalEat(birds);
		
		List<?> test1 = new ArrayList<Dog>();
		List<? extends Animal> test2 = new ArrayList<Dog>();
		List<? extends MyInterface> test3 = new ArrayList<Dog>();
		List<? super Dog> test4 = new ArrayList<Animal>();
		List<? super Dog> test5 = new ArrayList<Object>();
		
		listObject(new ArrayList<Object>());
//		listObject(new ArrayList<Dog>());
		
		listAnyObject(new ArrayList<Object>());
		listAnyObject(new ArrayList<Dog>());
	}
	
	private static void doAnimalEat(List<? extends Animal> animals) {
//		animals.add(new Dog());
		for (Animal animal : animals) {
			animal.eat();
		}
	}
	
	private static void listObject(List<Object> list) {
		list.add(new Bird());
	}
	
	private static void listAnyObject(List<?> list) {
//		list.add(new Bird());
	}

}
