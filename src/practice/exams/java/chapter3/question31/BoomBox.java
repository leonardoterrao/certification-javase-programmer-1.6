package practice.exams.java.chapter3.question31;


class Stereo {
	void makeNoise() { assert false; }
}

public class BoomBox extends Stereo {

	public static void main(String[] args) {
		new BoomBox().go(args);
	}

	private void go(String[] args) {
		if (args.length > 0) makeNoise();
		if (!args[0].equals("x")) System.out.println("!x");
	}
	
}
