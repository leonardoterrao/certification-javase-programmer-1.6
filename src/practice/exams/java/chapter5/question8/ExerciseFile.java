package practice.exams.java.chapter5.question8;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class ExerciseFile {

	public static void main(String[] args) {
		
		try {
			File file = new File("/home/leonardo/myFile.txt");
			PrintWriter pw = new PrintWriter(file);
			pw.println("line 1");
			pw.close();
			PrintWriter pw2 = new PrintWriter("/home/leonardo/myFile.txt");
			pw2.println("line 2");
			pw2.close();
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
