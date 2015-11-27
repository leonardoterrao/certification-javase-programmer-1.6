package practice.exams.java.chapter4.question6.a;

import java.util.Comparator;

import practice.exams.java.chapter4.question6.Items;

public class ItemsNameComparator implements Comparator<Items> {

	@Override
	public int compare(Items o1, Items o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
