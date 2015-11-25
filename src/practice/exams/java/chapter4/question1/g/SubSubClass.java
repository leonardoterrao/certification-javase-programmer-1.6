package practice.exams.java.chapter4.question1.g;

import java.util.ArrayList;
import java.util.List;

public class SubSubClass extends SubClass {

	public static final String CONST = "SUBSUB_CONST";
	
	public static String staticMethod() {
		return "SubSubClass.staticMethod";
	}
	
	@Override
	public String methodX() {
		return "SubSubClass.methodX";
	}
	
	public static void main(String[] args) {
		SubSubClass subsub1 = new SubSubClass();
		SubClass sub1 = new SubSubClass();
		SuperClass super1 = new SubSubClass();
		SubClass sub2 = new SubClass();
		SuperClass super2 = new SubClass();
		SuperClass super3 = new SuperClass();
		
		System.out.println("-- Instance Method --");
		System.out.println(subsub1.methodX() + " --- " + subsub1.staticMethod());
		System.out.println(sub1.methodX() + " --- " + sub1.staticMethod());
		System.out.println(super1.methodX() + " --- " + super1.staticMethod());
		System.out.println(sub2.methodX() + " --- " + sub2.staticMethod());
		System.out.println(super2.methodX() + " --- " + super2.staticMethod());
		System.out.println(super3.methodX() + " --- " + super3.staticMethod());

		List<SuperClass> itens = new ArrayList<SuperClass>();
		itens.add(subsub1);
		itens.add(sub1);
		itens.add(super1);
		itens.add(sub2);
		itens.add(super2);
		itens.add(super3);
		
		System.out.println("-- loop --");
		for (SuperClass clazz : itens) {
			System.out.println(clazz.methodX() + " --- " + clazz.CONST);
		}
		
		sub2 = subsub1;
		super2 = super3;
		super3 = super2;
		super3 = subsub1;
		subsub1 = (SubSubClass) super3;
		
		System.out.println(sub1.methodX());
		System.out.println(super3.methodX());
		System.out.println(subsub1.methodX());
		
		
	}
	
}
