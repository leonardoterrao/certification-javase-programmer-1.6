package practice.exams.java.chapter4.question1.d;

public class SuperStatic {

	static {
		System.out.println("SUPER A");
	}
	
	{
		System.out.println("SUPER B");
	}
	
	public SuperStatic() {
		System.out.println("SUPER C");
	}
	
}
