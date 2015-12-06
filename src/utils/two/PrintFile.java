package utils.two;

import java.io.BufferedReader;
import java.io.IOException;

public class PrintFile {

	public static void main(String[] args) {
		BufferedReader buffReader = null;
		try {
			String temp;
			while ((temp = buffReader.readLine()) != null) {
				System.out.println(temp);
			}	
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
