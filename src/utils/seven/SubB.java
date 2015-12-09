package utils.seven;

class X {
	public void foo() {
		System.out.print("X ");
	}
	
	public void bar() {
		
	}
}

public class SubB extends X {
	public void foo() throws RuntimeException {
		super.foo();
		if (true)
			throw new RuntimeException();
		System.out.print("B ");
	}

//	public void bar() throws Exception {
//	}

	public static void main(String[] args) {
		new SubB().foo();
	}
}