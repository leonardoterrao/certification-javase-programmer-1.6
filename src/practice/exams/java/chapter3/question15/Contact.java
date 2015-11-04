package practice.exams.java.chapter3.question15;

public class Contact {

	private String name;
	private String city;
	
	String getName() {
		return name;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	public void setCity(String city) {
		if (city == null) throw new NullPointerException();
		this.city = city;
	}
	
	String getCity() {
		return city;
	}
}
