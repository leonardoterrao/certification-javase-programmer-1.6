package practice.exams.java.chapter4.question4.c;

public class ThreadMethodsExample {

	public static void main(String[] args) {
		try {
			new ThreadMethodsExample();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public ThreadMethodsExample() throws InterruptedException {
		
		Thread t1 = new Thread1();
		Thread t2 = new Thread2();
		Thread t3 = new Thread3();
		
		t1.join();
		t2.setPriority(Thread.MAX_PRIORITY);

		t1.start();
		t2.start();
		t3.start();
		
		t3.interrupt();
	}
	
	class Thread1 extends Thread {
		
		@Override
		public void run() {
			
			System.out.println("Sleep 1");
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Finish Sleep. 1");
			
		}
		
	}
	
	class Thread2 extends Thread {
		
		@Override
		public void run() {
			
			System.out.println("Sleep 2");
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Finish Sleep. 2");
			
		}
		
	}
	
	class Thread3 extends Thread {
		
		@Override
		public void run() {
			
			System.out.println("Sleep 3");
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Finish Sleep. 3");
			
		}
		
	}
	
}
