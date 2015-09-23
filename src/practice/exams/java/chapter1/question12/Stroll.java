package practice.exams.java.chapter1.question12;

class Mosey implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 1000000; i++) {
			System.out.println(Thread.currentThread().getId() + "-" + i + " ");
		}
	}
}

public class Stroll {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Mosey());
//		t1.setPriority(1);
//		new Mosey().run();
//		t1.start();

//		t1.setPriority(9);
//		new Mosey().run();
//		t1.start();

		t1.setPriority(1);
		t1.start();
		new Mosey().run();
	}
}
