package utils.three;

public class WaitForSignal {

	public static void main(String[] args) throws InterruptedException {
		new WaitForSignal().waitForSignal();
	}

	void waitForSignal() throws InterruptedException {
		Object obj = new Object();
		synchronized (Thread.currentThread()) {
			obj.wait();
			obj.notify();
		}
	}
}
