package utils;

public class Sync {

//	private synchronized Obeject o;
	
//	void go() {
//		synchronized () {
//			
//		}
//	}
	
	public synchronized void go() {}
	
//	private synchronized(this) void go(int w) {}
	
	void go(int x) {
		synchronized (Sync.class) {
			
		}
	}
	
	void go(int... x) {
		Object o = new Object();
		synchronized (o) {
		}
	}
}
