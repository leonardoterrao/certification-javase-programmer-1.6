package practice.exams.java.chapter4.question6.h;

import java.util.ArrayList;
import java.util.List;

public class NonGenericCollection {

	public static void main(String[] args) {
		new NonGenericCollection();
	}
	
	public NonGenericCollection() {

		List list = new ArrayList();
		
		list.add("String1");
		list.add("String2");
		list.add("String3");
		list.add("String4");
		list.add(45);
		
		for (Object object : list) {
			System.out.println(((String) object).toUpperCase());
		}
	}
	
}
