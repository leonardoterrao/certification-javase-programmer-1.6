package practice.exams.java.chapter5.question6;

class Stereo { void makeNoise() {assert true; } }

public class BomBox2 extends Stereo {
	
	public static void main(String[] args) {
		new BomBox2().go(args);
	}

	private void go(String[] args) {
		if (args.length > 0) makeNoise();
		if (args[0].equals("x")) System.out.println("x ");
		if (args[0] == "x") System.out.println("x2 ");
	}
	
}
