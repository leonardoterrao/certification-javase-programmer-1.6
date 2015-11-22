package practice.exams.java.chapter4.question3.d;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileExample {

	public static void main(String[] args) {
		File file = new File("/home/leonardo/file-from-cert.txt");
		try {
			writeFile(file);
			readFile(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void readFile(File file) throws IOException {
		FileReader fileReader = new FileReader(file);
		char[] content = new char[100];
		int size = fileReader.read(content);
		System.out.println("Size: " + size);
		
		for (char c : content) {
			System.out.print(c);
		}
		
		fileReader.close();
	}

	private static void writeFile(File file) throws IOException {
		file.createNewFile();
		FileWriter fileWriter = new FileWriter(file);
		fileWriter.write("Olá Mundo!!!\n");
		fileWriter.write("Como você está?\nQue dia é hoje Mundo?\n");
		fileWriter.flush();
		fileWriter.close();
	}
	
}
