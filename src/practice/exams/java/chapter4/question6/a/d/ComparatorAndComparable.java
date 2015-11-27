package practice.exams.java.chapter4.question6.a.d;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import practice.exams.java.chapter4.question6.Items;
import practice.exams.java.chapter4.question6.a.ItemsNameComparator;

public class ComparatorAndComparable {

	private static List<Items> items = new ArrayList<Items>();
	
	public static void main(String[] args) {
		
		items.add(new Items("AAA", 50));
		items.add(new Items("BBB", 40));
		items.add(new Items("CCC", 30));
		items.add(new Items("DDD", 20));
		items.add(new Items("EEE", 10));

		Collections.sort(items);
		System.out.println(items.toString());
		
		ItemsNameComparator comparator = new ItemsNameComparator();
		Collections.sort(items, comparator);
		System.out.println(items.toString());
		
		
	}
	
}
