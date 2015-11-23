package practice.exams.java.chapter4.question4.d;

import com.sun.swing.internal.plaf.synth.resources.synth;

public class ConcurrencyExampleSync {

	public static void main(String[] args) {
		new ConcurrencyExampleSync();
	}

	public ConcurrencyExampleSync() {
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

		public static synchronized void increment() {
			c++;
		}

		public static synchronized int value() {
			return c;
		}

	}

}
