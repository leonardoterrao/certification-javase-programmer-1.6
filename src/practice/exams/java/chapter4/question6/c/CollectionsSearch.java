package practice.exams.java.chapter4.question6.c;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsSearch {

	public static void main(String[] args) {
		
		List<String> strings = Arrays.asList("A2", "B4" , "C3" , "E6", "X8");
		
		int position = Collections.binarySearch(strings, "E6");
		System.out.println(position);
		System.out.println(strings.get(position));
		
		position = Collections.binarySearch(strings, "WE");
		System.out.println(position);
		
		
	}

}
