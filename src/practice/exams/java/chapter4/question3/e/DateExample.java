package practice.exams.java.chapter4.question3.e;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateExample {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(2000000000);

		System.out.println(c.getFirstDayOfWeek());
		System.out.println(c.get(Calendar.DAY_OF_WEEK));

		Date d = c.getTime();
		System.out.println(d);

		System.out.println(sdf.format(d));

		c.add(Calendar.MONTH, 15);
		
		System.out.println(sdf.format(c.getTime()));
		
		Locale locale = Locale.getDefault();
		
		System.out.println(c.getDisplayName(Calendar.SECOND, Calendar.SHORT, locale));
	
		methodRoll();
	}

	private static void methodRoll() {
		Date d = new Date(1000000000000L);
		Calendar c = Calendar.getInstance();
		System.out.println(d);
		
		c.setTime(d);
		c.roll(Calendar.MONTH, 10);
		
		System.out.println(c.getTime());
		
		c.add(Calendar.MONTH, 10);
		System.out.println(c.getTime());
	}
	
}
