package practice.exams.java.chapter4.question7.e;

public class Loops {

	public static void main(String[] args) {

		int i = 0; 
		for(; i < 5;) {
			System.out.print(i++ + " ");
		}
		
		System.out.println();
		
		for(i = 0; i < 5;) {
			System.out.print(++i + " ");
		}
		
		System.out.println();
		
		i = 0;
		while(i < 5) {
			System.out.print(i++ + " ");
		}

		System.out.println();

		i = 0;
		while(i < 5) {
			System.out.print(++i + " ");
		}
		
	}
	
}
