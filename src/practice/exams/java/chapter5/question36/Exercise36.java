package practice.exams.java.chapter5.question36;

import practice.exams.java.chapter5.question36.Tire.Wheel;

class Tire {
	private static int x = 6;
	public static class Wheel {
		void go() { System.out.println("roll" + x++); }
	}
}

public class Exercise36 {

	public static void main(String[] args) {
		new Tire.Wheel().go();
//		Tire t = new Tire(); t.Wheel().go();
		Tire.Wheel w = new Tire.Wheel(); w.go();
		Wheel w2 = new Wheel(); w2.go();
	}
	
}
