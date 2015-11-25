package practice.exams.java.chapter4.question5.h.is.a;

public class Clazz {

	public static void main(String[] args) {
		new Clazz();
	}
	
	public Clazz() {
		Dog dog = new Dog();
		if (dog instanceof Animal) {
			System.out.println("Dog is an Animal");
		}
		
		Cat cat = new Cat();
		if (cat instanceof Feline) {
			System.out.println("Cat is a Feline");
		}
		
		if (cat instanceof Animal) {
			System.out.println("Cat is an Animal");
		}
		
		
	}

}
