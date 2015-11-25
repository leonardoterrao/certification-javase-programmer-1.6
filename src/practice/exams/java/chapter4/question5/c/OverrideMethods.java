package practice.exams.java.chapter4.question5.c;

import java.io.FileNotFoundException;
import java.io.IOException;

public class OverrideMethods extends SubClass {

//	@Override
//	public void methodX(String string) {
//	}
	@Override
	protected void methodX(String string) {
	}
	
//	@Override
//	protected void methodY(String string) {
//	}
//	@Override
//	protected void methodY(String string) throws FileNotFoundException {
//	}
	@Override
	protected void methodY(String string) throws RuntimeException {
	}

//	@Override
//	protected void methodZ(String string) {
//	}
//	@Override
//	protected void methodZ(String string) throws RuntimeException {
//	}
	@Override
	protected void methodZ(String string) throws ArithmeticException {
	}

//	@Override
//	protected String methodW(String string) throws IOException, ArithmeticException {
//		return "";
//	}
//	@Override
//	protected String methodW(String string) throws FileNotFoundException, RuntimeException {
//		return "";
//	}
//	@Override
//	protected String methodW(String string) throws FileNotFoundException {
//		return "";
//	}
//	@Override
//	protected String methodW(String string) throws ArithmeticException {
//		return "";
//	}
	@Override
	protected String methodW(String string) {
		return "";
	}

}
