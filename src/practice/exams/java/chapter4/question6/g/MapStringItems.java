package practice.exams.java.chapter4.question6.g;

import java.util.HashMap;
import java.util.Map;

import practice.exams.java.chapter4.question1.h.Clazz;
import practice.exams.java.chapter4.question6.Items;

public class MapStringItems {

	public MapStringItems() {

		Map<String, Items> map = new HashMap<String, Items>();
		map.put("key0", new Items("hi", 4));
//		map.put(45, new Items("hi", 4));
//		map.put(new Clazz(), new Items("hi", 4));
//		map.put(new Clazz(), "string");
	}
	
}
