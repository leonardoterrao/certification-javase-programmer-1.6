package utils.seven;

import java.util.*;

public class Explorer3 {
	public static void main(String[] args) {
		TreeSet<Integer> s = new TreeSet<Integer>();
		TreeSet<Integer> subs = new TreeSet<Integer>();
		for (int i = 606; i < 613; i++)
			if (i % 2 == 0)
				s.add(i);
		subs = (TreeSet) s.subSet(608, true, 611, true);
		subs.add(629);
		System.out.println(s + " " + subs);
	}
}