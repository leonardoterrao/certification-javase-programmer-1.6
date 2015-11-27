package practice.exams.java.chapter4.question6.i;

public class ClazzGeneric<T> {

	private T instance;
	
	public T getInstance() {
		return instance;
	}
	
	public void setInstance(T instance) {
		this.instance = instance;
	}
	
}
