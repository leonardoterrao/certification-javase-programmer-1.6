package utils.two;

import java.util.*;

public class LetterASort {
	public static void main(String[] args) {
		ArrayList<String> strings = new ArrayList<String>();
		strings.add("A");
		strings.add("a");
		strings.add("B");
		strings.add("b");
		strings.add("4");
		strings.add("1");
		Collections.sort(strings);
		for (String s : strings) {
			System.out.print(s + " ");
		}
	}
}