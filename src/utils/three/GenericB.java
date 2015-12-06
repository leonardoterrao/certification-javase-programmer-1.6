package utils.three;

public class GenericB<T extends Pet> {

	public T foo;
	
	public void setFoo(T foo) {
		this.foo = foo;
	}
	
	public T getFoo() {
		return foo;
	}
	
	public static void main(String[] args) {
		GenericB<Cat> bar = new GenericB<Cat>();
		bar.setFoo(new Cat());
		Cat c = bar.getFoo();
		System.out.println(c);
	}
}

interface Pet {}
class Cat implements Pet {}