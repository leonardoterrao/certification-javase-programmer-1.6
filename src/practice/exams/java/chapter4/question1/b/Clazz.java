package practice.exams.java.chapter4.question1.b;

import practice.exams.java.chapter4.question1.a.AbstractX;
import practice.exams.java.chapter4.question1.a.InterfaceX;

public class Clazz extends AbstractX implements InterfaceX {

	@Override
	void methodX() {//nerver compile, AbstractX is in other package and have a default method.
		// TODO Auto-generated method stub
	}

	@Override
	protected void methodA() {
		// TODO Auto-generated method stub
	}

	@Override
	public void methodZ() {
		System.out.println(DEFAULT_CONST);
		System.out.println(PUBLIC_CONST);
		System.out.println(PUBLIC_ABSTRACT_CONST);
	}

	
}
