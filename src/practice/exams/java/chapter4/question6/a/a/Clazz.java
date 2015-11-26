package practice.exams.java.chapter4.question6.a.a;

import java.util.HashSet;
import java.util.Set;

import practice.exams.java.chapter4.question6.a.Items;

public class Clazz {

	public static void main(String[] args) {
		
		Set<Items> items = new HashSet<Items>();
		items.add(new Items("ABC", 20));
		items.add(new Items("DEF", 50));
		items.add(new Items("ABC", 20));
		items.add(new Items("ABC", 20));
		items.add(new Items("ZFA", 210));
		
		for (Items item : items) {
			System.out.println(item.toString());
		}
		
	}
	
}
