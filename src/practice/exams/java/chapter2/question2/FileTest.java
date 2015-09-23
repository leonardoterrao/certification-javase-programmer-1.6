package practice.exams.java.chapter2.question2;

import java.io.File;

public class FileTest {

	public static void main(String[] args) {
		String path = FileTest.class.getClassLoader().getResource("practice/exams/java/chapter2/question2").getPath();
		String name = path + File.pathSeparator + "testDir" + File.pathSeparator + "subDir2" + File.pathSeparator + "Shackelton.txt";
		File f = new File(name);
		System.out.println("exists " + f.exists());
	}

}
