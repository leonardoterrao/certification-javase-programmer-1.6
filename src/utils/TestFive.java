package utils;

public class TestFive {

	public static void main(String[] args) {
		new TestFive().go();
	}
	
	private int x;

	public synchronized void foo() {
		int current = x;
		x = current + 1;
		System.out.print(x + ", ");
	}

	public void go() {
		for (int i = 0; i < 5; i++) {
			synchronized (this) {
				new Thread() {
					public void run() {
						foo();
					}}.start();
			}
		}
	}

}
