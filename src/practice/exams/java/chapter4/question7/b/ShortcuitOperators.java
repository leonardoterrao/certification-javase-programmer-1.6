package practice.exams.java.chapter4.question7.b;

public class ShortcuitOperators {

	public static void main(String[] args) {
		
		if (true && true) {
			System.out.println("&& ok");
		}
		
		if (true && false) {
			System.out.println("&& error");
		} else {
			System.out.println("else &&");
		}
		
		if (true & true) {
			System.out.println("& error");
		}
		
		if (true & false) {
			System.out.println("& error");
		} else {
			System.out.println("else &");
		}
		
		if (true || true) {
			System.out.println("|| ok");
		}
		
		if (true || false) {
			System.out.println("|| ok");
		}
		
		if (false || false) {
			System.out.println("|| error");
		} else {
			System.out.println("else ||");
		}
		
		if (true | true) {
			System.out.println("| ok");
		}
		
		if (true | false) {
			System.out.println("| ok");
		}
		
		if (false | false) {
			System.out.println("| error");
		} else {
			System.out.println("else |");
		}
	}
}
