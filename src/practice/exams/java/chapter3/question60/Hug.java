package practice.exams.java.chapter3.question60;

public class Hug implements Runnable {

	static Thread t1;
	static Hold h, h2;

	public void run() {
		if (Thread.currentThread().getId() == t1.getId())
			h.adjust();
		else
			h2.view();
	}

	public static void main(String[] args) {
		h = new Hold();
		h2 = new Hold();
		t1 = new Thread(new Hug());
		t1.start();
		new Thread(new Hug()).start();
	}
}

class Hold {
	static int x = 5;

	synchronized void adjust() {
		System.out.print(x-- + " ");
		try {
			Thread.sleep(200);
		} catch (Exception e) {
			;
		}
		view();
	}

	synchronized void view() {
		try {
			Thread.sleep(200);
		} catch (Exception e) {
			;
		}
		if (x > 0)
			adjust();
	}

}
