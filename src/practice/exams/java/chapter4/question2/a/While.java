package practice.exams.java.chapter4.question2.a;

public class While {

	public static void main(String[] args) {
		
		int x = 0;
		
		while(x < 5) {
			System.out.print(x++ + " ");
		}
		
		System.out.println("");
		x = 0;
		while(x < 5) {
			System.out.print(++x + " ");
		}
		
		System.out.println("");
		x = 0;
		do {
			System.out.print(x++ + " ");
		} while (x < 5);
		
		System.out.println("");
		x = 0;
		do {
			System.out.print(++x + " ");
		} while (x < 5);

		System.out.println("");
		for (int i = 0; i < 5; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println("");
		for (int i = 0; i < 5; ++i) {
			System.out.print(i + " ");
		}
		
	}
	
}
