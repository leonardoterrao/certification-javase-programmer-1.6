package utils;

public class ThreadOutput {

	public static void main(String[] args) throws InterruptedException {
		
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println("interrupted");
				}
				System.out.println("ran");
			}
		};
		
		Thread t = new Thread(r);
		t.start();
		System.out.println("started");
		t.sleep(2000);
		System.out.println("interrupting");
		t.interrupt();
		System.out.println("ended");
		
	}
	
}
