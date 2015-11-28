package practice.exams.java.chapter4.question7.f;

import java.util.Properties;

public class PropertiesExample {

	public static void main(String[] args) {
		Properties properties = new Properties();
		properties.setProperty("prop1", "PROPERTIES_NUMBER_1");

		System.setProperties(properties);

		System.setProperty("prop2", "PROPERTIES_NUMBER_2");

		for (Object property : System.getProperties().keySet()) {
			System.out.println(property.toString());
		}
				
	}
	
}
