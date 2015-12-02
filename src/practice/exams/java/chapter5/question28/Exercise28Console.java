package practice.exams.java.chapter5.question28;

import java.io.Console;

public class Exercise28Console {

	public static void main(String[] args) {
		Console c = System.console();
		char[] pw;
		if (c == null) return;
		pw = c.readPassword("%s", "pw: ");
		System.out.println(c.readLine("%s", "input: "));
	}
	
}
