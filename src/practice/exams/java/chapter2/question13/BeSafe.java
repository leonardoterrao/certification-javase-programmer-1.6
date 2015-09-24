package practice.exams.java.chapter2.question13;

class SafeDeposit {
	private static SafeDeposit singleton;
	public static SafeDeposit getInstance(int code) {
		if (singleton == null)
			singleton = new SafeDeposit(code);
		
		return singleton;
	}
	
	private int code;
	private SafeDeposit(int c) {
		code = c;
	}
	
	int getCode() {
		return code;
	}
	
}

public class BeSafe {
	
	public static void main(String[] args) {
		
		
	}
}
