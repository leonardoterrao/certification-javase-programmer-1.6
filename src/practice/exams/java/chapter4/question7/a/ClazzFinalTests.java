package practice.exams.java.chapter4.question7.a;

public class ClazzFinalTests {

	public static void main(String[] args) {
		new ClazzFinalTests();
	}
	
	final int primitiveFinal;

	final Long variableFinal;
	
	public ClazzFinalTests() {
		primitiveFinal = 50;
		variableFinal = 5055L;
	
		
		System.out.println(primitiveFinal);
		setNewVale(primitiveFinal);
		System.out.println(primitiveFinal);
	
		System.out.println(variableFinal);
		setNewVale(variableFinal);
		System.out.println(variableFinal);
		
//		variableFinal = 987L;
//		primitiveFinal = 7;
	}
	
	private void setNewVale(Long variableFinal) {
		variableFinal = 5L;
	}

	private void setNewVale(int primitiveFinal) {
		primitiveFinal = 50;
	}

}
