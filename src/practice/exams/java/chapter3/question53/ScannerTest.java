package practice.exams.java.chapter3.question53;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		String in = "1234,77777,689";
		Scanner sc = new Scanner(in);
		sc.useDelimiter(",");
		while (sc.hasNext())
			System.out.print(sc.nextInt() + " ");
		while (sc.hasNext())
			System.out.print(sc.nextShort() + " ");
	}
}
