package practice.exams.java.chapter2.question7;

class Game {
	static String s = "-";
	String s2 = "s2";
	public Game(String arg) {
		s += arg;
	}
}

public class Go extends Game {

	public Go() {
//		super(s2);
		super("s2");
	}

	{s += "i ";}
	
	public static void main(String[] args) {
		new Go();
		System.out.println(s);
	}
	
	static {s += "sb ";}
	
}
