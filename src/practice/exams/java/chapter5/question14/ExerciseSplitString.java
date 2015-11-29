package practice.exams.java.chapter5.question14;

public class ExerciseSplitString {

	public static void main(String[] args) {
		String s = "4.5x4.a.3";
		String[] tokens = s.split("\\s");
		for (String o : tokens)
			System.out.print(o + " ");
		System.out.print(" ");
		tokens = s.split("\\..");
		for (String o : tokens)
			System.out.print(o + " ");
	}

}
