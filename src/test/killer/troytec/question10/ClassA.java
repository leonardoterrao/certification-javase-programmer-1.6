package test.killer.troytec.question10;

class ClassA {}
class ClassB extends ClassA {}
class ClassC extends ClassA{};

class Test {
	
	public static void main(String[] args) {
		
		ClassA p0 = new ClassA();
		ClassB p1 = new ClassB();
		ClassC p2 = new ClassC();
		ClassA p3 = new ClassB();
		ClassA p4 = new ClassC();
		
		/*
		A p0 = p1; V
		B p1 = p2; F
		C p2 = p4; F
		D p2 = (ClassC)p1; F
		E p1 = (ClassB)p3; V
		F p2 = (ClassC)p4; V
		 */

	}
}