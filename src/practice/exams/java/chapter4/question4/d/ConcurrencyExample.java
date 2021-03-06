package practice.exams.java.chapter4.question4.d;

public class ConcurrencyExample {

	public static void main(String[] args) {
		new ConcurrencyExample();
	}

	public ConcurrencyExample() {
		Run r = new Run();
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		
		t1.setName("T1");
		t2.setName("T2");
		
		t1.start();
		t2.start();
	}

	class Run implements Runnable {
		@Override
		public void run() {
			while (Counter.value() < 10) {
				Counter.increment();
				System.out.println(Counter.value() + " - " + Thread.currentThread().getName());
			}
		}
	}
	
	static class Counter {
		private static int c = 0;

		public static void increment() {
			c++;
		}

		public static void decrement() {
			c--;
		}

		public static int value() {
			return c;
		}

	}

}
