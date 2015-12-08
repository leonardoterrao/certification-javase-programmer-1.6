package utils.five;

class TestException extends Exception {
}

class A {
	public String sayHello(String name) throws TestException {
		if (name == null)
			throw new TestException();
		return "Hello " + name;
	}
}

public class TestA {
	public static void main(String[] args) throws TestException {
		new A().sayHello("Aiko");
	}
}