package practice.exams.java.chapter4.question3.h;

public class Split {

	public static void main(String[] args) {
		
		String value = "3.14, 0x17-5b, cat.dog.";
		String[] tokens = value.split("[., ]");
		
		for (String string : tokens) {
			System.out.println(string);
		}
	}
	
}
