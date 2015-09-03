package test.killer.troytec.demo.question8;

public class Barn {

	public static void main(String[] args) {
		new Barn().go(1, "hi");
		new Barn().go(2, "hi", "world");
	}

	private void go(int x, String... y) {
		System.out.println(y[y.length-1] + " ");
	}
}
