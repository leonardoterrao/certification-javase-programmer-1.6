package practice.exams.java.chapter4.question6.a.c;

import java.util.ArrayList;
import java.util.List;

import practice.exams.java.chapter4.question6.Items;

public class Clazz {

	private static List<Items> items = new ArrayList<Items>();
	
	public static void main(String[] args) {
		
		items.add(new Items("buyer", 50));
		items.add(new Items("hello", 22));
		items.add(new Items("blue", 55));
		items.add(new Items("computer", 98));
		items.add(new Items("dog", 64));
		
		Items item = getItem("buyer");
		System.out.println(item.toString());
	}

	private static Items getItem(String string) {
		for (Items item : items) {
			if (item.getName().equals(string)) {
				return item;
			}
		}
		
		throw new RuntimeException("Item does not exist.");
	}
	
}
