package practice.exams.java.chapter4.question3.g;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExamples {

	public static void main(String[] args) {
	    String matcherValue = "a4 0x12 5b _x_ 056 092 0x5g";
	
	    //Digits
	    Pattern p = Pattern.compile("\\d");
		Matcher m = p.matcher(matcherValue);
		while (m.find()) {
			System.out.print(m.start() + " ");
		}
		
		System.out.println("");

		//word characters
		p = Pattern.compile("[a-z]");
		m = p.matcher(matcherValue);
		while (m.find()) {
			System.out.print(m.start() + " ");
		}
		
		System.out.println("");
		
		//hexadecimal
		p = Pattern.compile("0[xX][a-f0-9]");
		m = p.matcher(matcherValue);
		while (m.find()) {
			System.out.print(m.start() + " ");
		}
		
		System.out.println("");

		//octal
		p = Pattern.compile("0[1-7][0-7]");
		m = p.matcher(matcherValue);
		while (m.find()) {
			System.out.print(m.start() + " ");
		}
		
	}
}
