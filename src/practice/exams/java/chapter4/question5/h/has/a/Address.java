package practice.exams.java.chapter4.question5.h.has.a;

public class Address {

	private String city;
	
	private String state;
	
	public Address(String city, String state) {
		this.city = city;
		this.state = state;
	}

	public String getCity() {
		return city;
	}
	
	public String getState() {
		return state;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + "]";
	}

}
