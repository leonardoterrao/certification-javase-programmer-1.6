package practice.exams.java.chapter5.question16;

public class Exercise16Thread implements Runnable {

	static Thread t1;
	static int x = 5;

	@Override
	public void run() {
		if (Thread.currentThread().getId() == t1.getId())
			shove();
		else
			push();
	}

	static synchronized void push() {
		shove();
	}

	static void shove() {
		synchronized (Exercise16Thread.class) {
			System.out.print(x-- + " ");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				;
			}
			if (x > 0)
				push();
		}
	}

	public static void main(String[] args) {
		t1 = new Thread(new Exercise16Thread());
		t1.start();
		new Thread(new Exercise16Thread()).start();
	}

}
