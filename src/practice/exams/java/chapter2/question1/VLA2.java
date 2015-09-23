package practice.exams.java.chapter2.question1;

import java.util.Arrays;
import java.util.Comparator;

public class VLA2 implements Comparator<VLA2>{

	int dishSize;
	
	public VLA2(int d) {
		dishSize = d;
	}

	public static void main(String[] args) {
		VLA2[] va = {new VLA2(40), new VLA2(200), new VLA2(60)};
		
		Arrays.sort(va, va[0]);
		int index = Arrays.binarySearch(va, new VLA2(40), va[0]);
		System.out.print(index + " ");
		index = Arrays.binarySearch(va, new VLA2(80), va[0]);
		System.out.print(index);
	}

	@Override
	public int compare(VLA2 a, VLA2 b) {
		return b.dishSize - a.dishSize;
	}
	
	@Override
	public String toString() {
		return String.valueOf(dishSize);
	}
}