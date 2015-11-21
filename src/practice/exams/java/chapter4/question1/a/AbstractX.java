package practice.exams.java.chapter4.question1.a;

public abstract class AbstractX {

	public static final String PUBLIC_ABSTRACT_CONST = "CONST";
	static final String DEFAULT_ABSTRACT_CONST = "CONST";
	
	public String publicValue = "public value";
	String defaultValue = "default value";
	
	
	abstract void methodX();

	protected abstract void methodA();
	
	void methodY() {
		System.out.println("Hi, I am methodY");
	}
	
}
