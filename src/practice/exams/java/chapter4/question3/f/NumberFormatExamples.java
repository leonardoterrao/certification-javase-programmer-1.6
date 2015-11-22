package practice.exams.java.chapter4.question3.f;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.text.ParseException;

public class NumberFormatExamples {

	public static void main(String[] args) {
		
		try {
			NumberFormat nf = NumberFormat.getInstance();
			Number number = nf.parse("345,67");
			System.out.println(number);
			System.out.println(number.intValue());

			BigDecimal bd = new BigDecimal("345.67");
			bd = bd.setScale(0, RoundingMode.DOWN);
			System.out.println(bd.toString());
			
			float f = 345.67f;
			nf = NumberFormat.getInstance();
			System.out.println(nf.getMaximumFractionDigits());
			System.out.println(nf.format(f));
			nf.setMaximumFractionDigits(0);
			nf.setRoundingMode(RoundingMode.DOWN);
			System.out.println(nf.format(f));
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}
	
}
