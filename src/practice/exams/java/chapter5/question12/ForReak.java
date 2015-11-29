package practice.exams.java.chapter5.question12;

abstract interface Pixie {
	abstract void sprinkle();
	static int dust = 3;
}

abstract class TinkerBell implements Pixie {
	String fly() { return "flying "; }
}

public class ForReak extends TinkerBell {
	public static void main(String[] args) {
		new ForReak().sprinkle();
	}

	public void sprinkle() { System.out.println(fly() + " " + dust); }
}
