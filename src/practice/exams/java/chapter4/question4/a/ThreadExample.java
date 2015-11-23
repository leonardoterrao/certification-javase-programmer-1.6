package practice.exams.java.chapter4.question4.a;

public class ThreadExample {

	public static void main(String[] args) {
		new ThreadExample();
	}
	
	{
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Hello !");
				Thread t2 = new Thread(new Run());
				t2.start();
			}
		});
		
		t.start();
		
	}
	
	class Run implements Runnable {

		@Override
		public void run() {

			System.out.println("RUN");
			
		}
		
	}
	
	
}
