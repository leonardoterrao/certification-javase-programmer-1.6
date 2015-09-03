package test.killer.troytec.question18;

class Super {
	
	private int a;
	
	public Super(int a) {
		this.a = a;
	}
}

public class Sub extends Super {

	public Sub(int a) {
		super(a);
	}
	
	public Sub() {
//		super(5);
		this(5);
	}

}
