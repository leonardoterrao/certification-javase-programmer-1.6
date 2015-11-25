package practice.exams.java.chapter4.question5.b;

public class UpDownCast {

	public static void main(String[] args) {
		new UpDownCast();
	}
	
	public UpDownCast() {

		Avo pessoa1 = new Pai();
		Pai pessoa2 = new Filho();
		Filho pessoa3 = new Filho();
		pessoa1 = pessoa3;
		
		Avo pessoa4 = new Filho();
		Pai pessoa5 = (Pai) pessoa4;
		Filho pessoa6 = (Filho) pessoa4;
		
//		Avo pessoa7 = new Avo();
		Pai pessoa7 = new Pai();
		pessoa3 = (Filho) pessoa7;
		
		
	}
	
}
