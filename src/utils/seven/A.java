package utils.seven;

class A {
	void foo() throws Exception {
		throw new Exception();
	}
	private void x() {}
}

class SubB2 extends A {
	void foo() {
		System.out.println("B ");
	}
	public void x() {}
}

class Tester {
	public static void main(String[] args) throws Exception {
		A a = new SubB2();
		a.foo();
	}
 }