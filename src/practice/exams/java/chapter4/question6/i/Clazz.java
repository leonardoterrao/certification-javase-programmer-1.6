package practice.exams.java.chapter4.question6.i;

import practice.exams.java.chapter4.question5.c.SubClass;
import practice.exams.java.chapter4.question6.Items;

public class Clazz {

	public static void main(String[] args) {
		
		ClazzGeneric<Items> itemsGeneric = new ClazzGeneric<Items>();
		itemsGeneric.setInstance(new Items());
		System.out.println(itemsGeneric.getInstance() instanceof Items);
		
		itemsGeneric.setInstance(new SubItems());
		System.out.println(itemsGeneric.getInstance() instanceof SubItems);
		
	}
	
}
