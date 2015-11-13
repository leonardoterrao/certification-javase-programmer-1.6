package revision.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {
//		Pattern p = Pattern.compile("aba");
//		Matcher m = p.matcher("abababa");
//		while (m.find()) {
//			System.out.print(m.start() + " ");
//		}

//		Pattern p = Pattern.compile("\\d");
//		Matcher m = p.matcher("a12c3e456f");
//		while (m.find()) {
//			System.out.print(m.start() + " ");
//		}
		
//		Pattern p = Pattern.compile("\\w");
//		Matcher m = p.matcher("a 1 56 _Z");
//		while (m.find()) {
//			System.out.print(m.start() + " ");
//		}
		
//		Pattern p = Pattern.compile("[A-Ca-c]");
//		Matcher m = p.matcher("cafeBABE");
//		while (m.find()) {
//			System.out.print(m.start() + " ");
//		}
		
		Pattern p = Pattern.compile("\\d+");
		Matcher m = p.matcher("1 a12 234b 4554dtc");
		while (m.find()) {
			System.out.print(m.start() + " ");
		}
	}
}
