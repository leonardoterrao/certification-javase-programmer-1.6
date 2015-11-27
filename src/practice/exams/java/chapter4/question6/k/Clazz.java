package practice.exams.java.chapter4.question6.k;

import java.util.ArrayList;
import java.util.List;

public class Clazz {

	public static void main(String[] args) {
		ArrayList arrayList = methodAnyType(new ArrayList());
		for (Object object : arrayList) {
			System.out.println(object.toString());
		}
	}

	private static ArrayList methodAnyType(Object object) {
		ArrayList list = (ArrayList) object;
		list.add(object);
		return list;
	}
	
}
