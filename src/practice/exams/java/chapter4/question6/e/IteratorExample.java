package practice.exams.java.chapter4.question6.e;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorExample {

	public static void main(String[] args) {
		
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("A");
		linkedList.add("B");
		linkedList.add("E");
		linkedList.add("D");
		linkedList.add("C");
		
		Iterator<String> iterator = linkedList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}
	
}
