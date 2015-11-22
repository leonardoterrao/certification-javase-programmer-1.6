package practice.exams.java.chapter4.question2.h;

public class AssertionSyntax {

	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);
		
//		assert x == 5;
//		assert x > 5 : "teste";
//		assert x > 5 : callMethod();
//		assert (x > 5) : callMethod();
		assert (x == 5) : callMethod();
	}

	private static String callMethod() {
		return "HEY!!";
	}
	
}
