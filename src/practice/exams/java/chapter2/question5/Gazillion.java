package practice.exams.java.chapter2.question5;

import java.text.NumberFormat;
import java.text.ParseException;

public class Gazillion {

	public static void main(String[] args) throws ParseException {
		String s = "123.456xyz";
		NumberFormat nf = NumberFormat.getInstance();
		System.out.println(nf.parse(s));
		nf.setMaximumFractionDigits(2);
		System.out.println(nf.format(s));
	}
	
}
