package practice.exams.java.chapter5.question25;

import java.util.Date;
import java.util.Locale;
import java.text.DateFormat;

public class Exercise25 {

	public static void main(String[] args) {
		Date d = new Date();
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
		Locale[] la = {new Locale("it", "IT"), new Locale("pt", "BR")};
		for (Locale l : la) {
//			df.setLocale(l);
			System.out.println(df.format(d));
		}
	}
	
}
