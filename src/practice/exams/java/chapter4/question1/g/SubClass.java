package practice.exams.java.chapter4.question1.g;

public class SubClass extends SuperClass {

	public static final String CONST = "SUB_CONST";
	
	@Override
	public String methodX() {
		return "SubClass.methodX";
	}
	
	public static String staticMethod() {
		return "SubClass.staticMethod";
	}
	
}
