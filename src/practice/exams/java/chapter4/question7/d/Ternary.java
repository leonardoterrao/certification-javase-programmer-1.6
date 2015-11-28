package practice.exams.java.chapter4.question7.d;

public class Ternary {

	public static void main(String[] args) {
		Integer x = null;
		
		try {
			x = Integer.parseInt(args[0]);
		} catch (NumberFormatException e) {
		}
		
		String statusResult = x == null ? "failure" : "success";
		System.out.println(statusResult);
	}
	
}
