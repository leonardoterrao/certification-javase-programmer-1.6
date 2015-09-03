package test.killer.troytec.demo.question6;

public class Threads4 {

	public static void main(String[] args) {
		new Threads4().go();
	}

	private void go() {
		Runnable r = new Runnable() {
			@Override
			public void run() {
				System.out.println("foo");
			}
		};
		
		Thread t = new Thread(r);
		t.start();
		t.start();
	}
}
