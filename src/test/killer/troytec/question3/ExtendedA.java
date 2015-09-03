package test.killer.troytec.question3;

class ClassA {
	public int numberOfInstances;
	protected ClassA(int numberOfInstances) {
		this.numberOfInstances = numberOfInstances;
	}
}

public class ExtendedA extends ClassA {

	private ExtendedA(int numberOfInstances) {
		super(numberOfInstances);
	}
	
	public static void main(String[] args) {
		ExtendedA ex = new ExtendedA(420);
		System.out.println(ex.numberOfInstances);
	}
}
