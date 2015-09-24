package practice.exams.java.chapter2.question10;

public class Main {

	public static void main(String[] args) {
		try {
			if (args.length == 0) throw new Exception();
		} catch (Exception e) {
			System.out.println("done ");
			doStuff();
		} finally {
			System.out.println("finally ");
		}
	}

	private static void doStuff() {
	}
	
}
