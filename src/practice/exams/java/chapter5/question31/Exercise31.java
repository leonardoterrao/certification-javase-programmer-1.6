package practice.exams.java.chapter5.question31;

public class Exercise31 extends Philosopher {

//	public Exercise31(String s) { super(s); }
//	public Exercise31() { this("Bart");	}
	
	public Exercise31() {
		super("Bart");
	}

	public Exercise31(String s) {
		super(s);
	}
	
	public static void main(String[] args) {
		new Exercise31("Homer");
		new Exercise31();
	}
	
}

class Philosopher {
	public Philosopher(String s) {
		System.out.print(s + " ");
	}
}