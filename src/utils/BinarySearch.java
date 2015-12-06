package utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearch {

	public static void main(String[] args) {
		search(new ArrayList<String>());
	}
	
	public static void search(List<String> list) {
		list.clear();
		list.add("b");
		list.add("a");
		list.add("c");
		System.out.println(Collections.binarySearch(list, "a"));
	}
	
}
