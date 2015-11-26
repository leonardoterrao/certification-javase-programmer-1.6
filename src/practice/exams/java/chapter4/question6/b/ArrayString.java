package practice.exams.java.chapter4.question6.b;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayString {

	public static void main(String[] args) {
		
		String[] arrayString = {"AA", "BB", "CC", "DD", "EE", "FF"};
		int position = Arrays.binarySearch(arrayString, "DD");
		System.out.println(position);
		System.out.println(arrayString[position]);

		position = Arrays.binarySearch(arrayString, "SQ");
		System.out.println(position);

		List<String> listString = Arrays.asList(arrayString);
		Collections.reverse(listString);
		arrayString = (String[]) listString.toArray();
		
		position = Arrays.binarySearch(arrayString, "DD");
		System.out.println(position);
		System.out.println(arrayString[position]);
		
		position = Arrays.binarySearch(arrayString, "T");
		System.out.println(position);
	}
	
}
