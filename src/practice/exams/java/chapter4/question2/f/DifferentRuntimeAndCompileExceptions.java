package practice.exams.java.chapter4.question2.f;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DifferentRuntimeAndCompileExceptions {

	public static void main(String[] args) {
		
	}
	
	public DifferentRuntimeAndCompileExceptions() {
		runtime();
		try {
			compile();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		compile2();
	}

	private void runtime() {

		Integer.parseInt("250");//can throw RuntimeException (NumberFormatException)
		
	}
	
	private void compile() throws ParseException {
		SimpleDateFormat df = new SimpleDateFormat();
		df.format(new Date());
		df.parse("ASDA");
	}
	
	private void compile2() {
		
		SimpleDateFormat df = new SimpleDateFormat();
		df.format(new Date());
		try {
			df.parse("ASDA");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}

}
