package practice.exams.java.chapter4.question7.l;

import practice.exams.java.chapter4.question7.l.other.ClassX;

public class ClassY {

	public static void main(String[] args) {
		new ClassY();	
	}
	
	public ClassY() {

		ClassX classX = new ClassX();
		Integer sumResult = classX.sum(10, 5);
		System.out.println(sumResult);

		Integer subtractResult = classX.subtract(10, 5);
		System.out.println(subtractResult);
	}
	
}
