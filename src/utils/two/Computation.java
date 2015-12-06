package utils.two;

public class Computation extends Thread {

	private int num;
	private boolean isCompleted;
	private int result;
	
	public Computation(int num) {
		this.num = num;
	}
	
	public synchronized void run() {
		result = num * 2;
		isCompleted = true;
		notify();
	}
	
	public synchronized int getResult() {
		while(!isCompleted) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		Computation[] computations = new Computation[4];
		for (int i = 0; i < computations.length; i++) {
			computations[i] = new Computation(i);
			computations[i].start();
		}
		
		for (Computation c : computations) {
			System.out.print(c.getResult());
		}
	}
	
}
