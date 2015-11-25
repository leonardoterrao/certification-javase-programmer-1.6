package practice.exams.java.chapter4.question5.h.has.a;

public class Clazz {

	public static void main(String[] args) {
		new Clazz();
	}
	
	public Clazz() {

		Address address = new Address("Maringá", "Paraná");
		Person person = new Person("Léo", 23, address);
		
		System.out.println("Person has-a: " +  person.getAddress());
		System.out.println(person.toString());
	}
	
}
