package practice.exams.java.chapter4.question6.d;

import java.util.Arrays;
import java.util.List;

public class ListAndArray {

	public static void main(String[] args) {
		
		Long[] longArray = {15L, 50L, 500L, 12L};
		List<Long> longList = Arrays.asList(longArray);
		longList.set(1, 22L);
		
		for (Long l : longList) {
			System.out.print(l + " ");
		}
		
		longArray[3] = 500001L;
		System.out.println("");

		for (Long l : longList) {
			System.out.print(l + " ");
		}
		
		longList.add(5003L);
	}
	
}
