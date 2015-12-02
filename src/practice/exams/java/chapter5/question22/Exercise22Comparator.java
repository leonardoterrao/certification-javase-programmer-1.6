package practice.exams.java.chapter5.question22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Exercise22Comparator {

	public static class NameCompare implements Comparator<Exercise22Comparator> {
		@Override
		public int compare(Exercise22Comparator a, Exercise22Comparator b) {
			return b.name.compareTo(a.name);
		}
	}

	public static class ValueCompare implements Comparator<Exercise22Comparator> {
		@Override
		public int compare(Exercise22Comparator a, Exercise22Comparator b) {
			return (a.value - b.value);
		}
		
		public ValueCompare() {
			// TODO Auto-generated constructor stub
		}
	}
	
	String name;
	
	int value;

	public Exercise22Comparator(String name, int value) {
		this.name = name;
		this.value = value;
	}

	@Override
	public String toString() {
		return "Exercise22Comparator [name=" + name + ", value=" + value + "]";
	}

	public static void main(String[] args) {
		List<Exercise22Comparator> values = new ArrayList<Exercise22Comparator>();
		values.add(new Exercise22Comparator("a", 1));
		values.add(new Exercise22Comparator("b", 2));
		values.add(new Exercise22Comparator("c", 3));
		values.add(new Exercise22Comparator("d", 4));
		ValueCompare valueCompare = new ValueCompare();
		Collections.sort(values, valueCompare);
		
		for (Exercise22Comparator value : values) {
			System.out.println(value.toString());
		}

		System.out.println("----------------");
		NameCompare nameCompare = new NameCompare();
		Collections.sort(values, nameCompare);
		
		for (Exercise22Comparator value : values) {
			System.out.println(value.toString());
		}
	}
	
}
