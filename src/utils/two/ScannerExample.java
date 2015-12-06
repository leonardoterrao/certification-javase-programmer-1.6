package utils.two;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner("one,5,true,3,true,6,7,false");
		scanner.useDelimiter(",");
		
		while(scanner.hasNext()) {
			if (scanner.hasNextBoolean()) {
				System.out.print(scanner.nextBoolean() + " ");
			} else {
				scanner.next();
			}
				
		}
	
	}
	
}
