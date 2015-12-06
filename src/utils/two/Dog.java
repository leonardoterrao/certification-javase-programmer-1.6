package utils.two;

import java.util.ArrayList;

class Animal {}

public class Dog extends Animal {

	public void go() {
		ArrayList<Dog> list = new ArrayList<Dog>();
		takeList(list);
	}
	
//	public void takeList(ArrayList list) {}
//	public void takeList(ArrayList<Animal> list) {}//
	public void takeList(ArrayList<? extends Animal> list) {}
//	public void takeList(ArrayList<?> list) {}
//	public void takeList(ArrayList<Object> list) {}
	
}
