package practice.exams.java.chapter3.question47;

class Dog {
	void makeNoise() { System.out.print("bark "); }

	static void play() { System.out.print("catching "); }
}

public class Bloodhound extends Dog {
	void makeNoise() { System.out.print("howl "); }
	public static void main(String[] args) {
		new Bloodhound().go();
//		super.play();
//		super.makeNoise();
	}
	
	void go() {
		super.play();
		makeNoise();
		super.makeNoise();
	}
}
