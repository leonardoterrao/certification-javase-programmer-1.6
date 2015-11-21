package practice.exams.java.chapter3.question58;

public class Hose <E extends Hose> {
	
	E innerE;
	
	public E doStuff(E e, Hose<E> e2) {
		return e;
	}
	
	public E getE() {
		return innerE;
	}

}
