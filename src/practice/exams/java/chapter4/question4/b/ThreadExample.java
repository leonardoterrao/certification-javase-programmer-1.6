package practice.exams.java.chapter4.question4.b;

public class ThreadExample {

	public static void main(String[] args) {
		new ThreadExample();
	}
	
	public ThreadExample() {
		ThreadWithRunnable runnable = new ThreadWithRunnable();
		
		Thread t1 = new ThreadWithThread();
		Thread t2 = new Thread(runnable);
		
		t1.start();
		t2.start();
		
	}
	
	class ThreadWithRunnable implements Runnable {

		@Override
		public void run() {
			
			System.out.println("Hi! I am a thread with Runnable!");
			
		}
		
	}
	
	class ThreadWithThread extends Thread {
		
		@Override
		public void run() {

			System.out.println("Hi! I am a thread with Thread!");
			
		}
		
	}
	
}
