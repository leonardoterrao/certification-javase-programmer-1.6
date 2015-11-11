package practice.exams.java.chapter3.question40;

public class Weed {
	protected static String s = "";
//	final void grow() {s += "grow ";}
	void grow() {s += "grow ";}
	static final void growFast() {s += "fast ";}
}

class Thistle extends Weed {
	void grow() {s += "t-grow ";}
//	void growFast() {s += "t-fast ";}
}