import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Clazz {

//	static int[] a;
//	static { a[0]=2; }
	
	public static void main(String[] args) {
//		 String csv = "Sue,5,true,3";
//		 Scanner scanner = new Scanner( csv );
//		 scanner.useDelimiter(",");
//		 scanner.nextInt();
		
		String[] elements = {"for", "tea", "too"};
		String first = (elements.length > 0) ? elements[0] : null;
		
		
		for (int i = 0; i <= 10; i++) {
			if (i > 6) break;
		}
		System.out.println(i);
		
	}

	public static void test(String str) throws IOException {
//		int check = 4;
//		if (check = str.length()) {
//			System.out.print(str.charAt(check -= 1) + ", ");
//		} else {
//			System.out.print(str.charAt(0) + ", ");
//		}
		
		
		new BufferedReader(new FileReader(""));
		new BufferedWriter(new PrintWriter(new FileWriter("")));
		
	}
}
