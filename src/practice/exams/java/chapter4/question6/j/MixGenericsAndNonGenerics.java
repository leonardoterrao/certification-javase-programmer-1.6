package practice.exams.java.chapter4.question6.j;

import java.util.ArrayList;
import java.util.List;

import practice.exams.java.chapter4.question6.Items;

public class MixGenericsAndNonGenerics {

	public static void main(String[] args) {
		new MixGenericsAndNonGenerics();
	}
	
	public MixGenericsAndNonGenerics() {
		List strings = new ArrayList<String>();
		strings.add("AS");
		strings.add(54);
		strings.add(new Items("HOHOHO", 45454));
		
		
		for (Object object : strings) {
			System.out.println(object.toString());
		}
	}
	
}
