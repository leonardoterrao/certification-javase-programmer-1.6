package practice.exams.java.question8;

import java.util.HashMap;
import java.util.Map;

public class Birthdays {
	
	public static void main(String[] args) {
		Map<Friends, String> hm = new HashMap<Friends, String>();
		hm.put(new Friends("Charis"), "Summer 2009");
		hm.put(new Friends("Draumur"), "Summer 2002");
		Friends f = new Friends("Draumur");
		System.out.println(hm.get(f));
	}
	
}

class Friends {
	
	String name;
	
	public Friends(String n) {
		name = n;
	}
}
