package practice.exams.java.chapter4.question6.a.b;

import java.util.PriorityQueue;

import practice.exams.java.chapter4.question6.Items;

public class Clazz {

	public static void main(String[] args) {
		
		PriorityQueue<Items> items = new PriorityQueue<Items>();
		items.offer(new Items("OLAR", 1));
		items.offer(new Items("PEIXE", 23));
		items.offer(new Items("ARROZ", 431));
		items.offer(new Items("SOM", 321));
		items.offer(new Items("VACA", 427));
		
		for (Items item : items) {
			System.out.println(item.toString());
		}
		
		System.out.println(items.peek().toString());
		System.out.println(items.peek().toString());
		
		System.out.println(items.poll().toString());
		System.out.println(items.poll().toString());
		System.out.println(items.poll().toString());
		System.out.println(items.poll().toString());
		System.out.println(items.poll().toString());
		System.out.println(items.size());
		
	}
	
}
