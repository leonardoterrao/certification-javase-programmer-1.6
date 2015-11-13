package practice.exams.java.chapter3.question41;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Decaf {

	public static void main(String[] args) {
		System.out.println("?");
		Pattern p1 = Pattern.compile("0([0-7])?");
		Matcher m1 = p1.matcher("1012 0208 430");
		while (m1.find()) {
			System.out.print(m1.group() + " ");
		}

		System.out.println("*");
		Pattern p2 = Pattern.compile("0([0-7])*");
		Matcher m2 = p2.matcher("1012 0208 430");
		while (m2.find()) {
			System.out.print(m2.group() + " ");
		}
		
		System.out.println("+");
		Pattern p3 = Pattern.compile("0([0-7])+");
		Matcher m3 = p3.matcher("1012 0208 430");
		while (m3.find()) {
			System.out.print(m3.group() + " ");
		}
	}

}
