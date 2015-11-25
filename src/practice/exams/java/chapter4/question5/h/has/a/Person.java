package practice.exams.java.chapter4.question5.h.has.a;

public class Person {

	private String name;
	
	private Integer age;
	
	private Address address;
	
	public Person(String name, Integer age, Address address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	
	public Integer getAge() {
		return age;
	}
	
	public Address getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + "]";
	}

	
	
}
