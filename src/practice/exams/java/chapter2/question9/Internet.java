package practice.exams.java.chapter2.question9;

public class Internet {

	private int y = 8;

	public static void main(String[] args) {
		new Internet().go();
	}

	public void go() {
		int x = 7;
		// TCPIP ip = new TCPIP();
		class TCPIP {
			void doIt() {
//				System.out.println(y + x);
				System.out.println(y);
			}
		}
		TCPIP ip = new TCPIP();
		ip.doIt();
	}
}
