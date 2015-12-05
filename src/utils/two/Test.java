package utils.two;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class A {}
class B extends A {}

public class Test {

	public static void main(String[] args) {
		List<A> listA = new LinkedList<A>();
		List<B> listB = new LinkedList<B>();
		List<Object> list0 = new LinkedList<Object>();
		
		m1(listA);
		m2(listA);
		m1(listB);
//		m2(listB);
//		m1(list0);
//		m2(list0);
	}


	public static void m1(List<? extends A> list) {}
	public static void m2(List<A> list) {}
}
