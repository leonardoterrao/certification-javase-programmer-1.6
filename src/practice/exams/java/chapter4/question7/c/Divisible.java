package practice.exams.java.chapter4.question7.c;

public class Divisible {

	public static void main(String[] args) {
		
		Integer integer1 = Integer.valueOf(args[0]);
		Integer integer2 = Integer.valueOf(args[1]);
		
		if (integer1 %  integer2 == 0) {
			System.out.println("Divisible.");
		} else {
			System.out.println("Not divisible.");
		}
		
	}
	
}
