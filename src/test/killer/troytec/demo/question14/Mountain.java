package test.killer.troytec.demo.question14;

class Atom {
	public Atom() {
		System.out.print("atom ");
	}
}

class Rock extends Atom {
	public Rock(String type) {
		System.out.print(type);
	}
}

public class Mountain extends Rock {
	public Mountain() {
		super("granite ");
		new Rock("granite ");
	}
	
	public static void main(String[] args) {
		new Mountain();
	}
}
