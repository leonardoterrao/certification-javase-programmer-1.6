package practice.exams.java.chapter4.question2.e;

public class TryCatchFinally {

	public static void main(String[] args) {
	
		try {
			throw new Exception("HI");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Finally");
		}
		
		try {
			System.out.println("what??");
		} finally {
			System.out.println("SSS");
		}

		try {
			throw new Exception("Hello");
		} catch (Exception e) {
			System.out.println("Error");
			System.exit(1);
		} finally {
			System.out.println("Finally?");
		}
		
		
	}
	
}
