package practice.exams.java.chapter4.question1.a;

public class ClassX extends AbstractX implements InterfaceX {

	
	@Override
	public void methodX() {
		System.out.println("Hi, I am methodX!");
	}

	public static void main(String[] args) {
		System.out.println(CONST);
		ClassX classX = new ClassX();
		classX.methodX();
		classX.methodY();
	}

	@Override
	protected void methodA() {
		// TODO Auto-generated method stub
		
	}
	
}
