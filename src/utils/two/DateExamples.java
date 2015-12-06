package utils.two;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateExamples {

	public static void main(String[] args) {
		
		Date d = new Date();
		DateFormat df = DateFormat.getDateInstance();
		
		Locale loc = Locale.getDefault();
		System.out.println(loc.getDisplayCountry() + " " + df.format(d));
		
		//
		System.out.printf("Pi is approximately %f and E is approximately %b", Math.PI, Math.E);
		
	}
	
}
