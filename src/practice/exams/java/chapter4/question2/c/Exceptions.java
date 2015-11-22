package practice.exams.java.chapter4.question2.c;

import practice.exams.java.chapter4.question1.g.SubClass;
import practice.exams.java.chapter4.question1.g.SuperClass;

public class Exceptions {

	public static void main(String[] args) {
		nullPointerException();
		classCastException();
		arrayIndexOutOfBoundsException();
		stackOverflowError();
		assertionError();
		numberFormatException();
	}

	private static void numberFormatException() {
		try {
			
			Integer.parseInt("x");
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}

	private static void assertionError() {
		try {

			int x = 5;
			assert x > 5;
		
		} catch (AssertionError ae) {
			ae.printStackTrace();
		}
		
	}

	private static void stackOverflowError() {
		try {
			
			nerverCall();
			
		} catch (StackOverflowError e) {
			e.printStackTrace();
		}
	}

	private static void nerverCall() {
		nerverCall();
	}

	private static void arrayIndexOutOfBoundsException() {
		try {
			
			int[] array = {1, 3};
			int x = array[5];
			System.out.println(x);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}

	private static void classCastException() {
		try {
			
			SubClass a = (SubClass) new SuperClass();

		} catch (ClassCastException e) {
			e.printStackTrace();
		}
	}

	private static void nullPointerException() {
		try {
			
			String x = null;
			x.length();
		
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
	}
	
}
