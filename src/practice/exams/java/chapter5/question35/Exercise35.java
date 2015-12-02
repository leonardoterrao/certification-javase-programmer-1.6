package practice.exams.java.chapter5.question35;

class Horse {
	static String s = "";
	void beBrisk() { s += "trot "; }
}

public class Exercise35 extends Horse {

	void beBrisk() { s += "tolt "; }
	
	public static void main(String[] args) {
		Horse x0 = new Horse();
		Horse x1 = new Exercise35();     x1.beBrisk();
		Exercise35 x2 = (Exercise35) x1; x2.beBrisk();
		Exercise35 x3 = (Exercise35) x0; x3.beBrisk();
		System.err.println(s);
	}
}
