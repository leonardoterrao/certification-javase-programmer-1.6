package utils;

public class TesTwo extends Thread {

	public static void main(String[] args) throws Exception {
		TesTwo t = new TesTwo();
		t.start();
		t.run();
		t.join();
		t.doIt();
		
	}
	
	public void run() {
		System.out.println("run.");
	}
	
	public void doIt() {
		System.out.println("doIt. ");
	}
	
}
