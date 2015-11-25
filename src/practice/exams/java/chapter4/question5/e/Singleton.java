package practice.exams.java.chapter4.question5.e;

public class Singleton {

	private static Singleton instance = null;
	
	private Singleton() {
	}
	
	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}

		return instance;
	}
	
}
