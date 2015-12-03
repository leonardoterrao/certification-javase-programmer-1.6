
public class GoTest {

	public static void main(String[] args) {
		Sente a = new Sente(); a.go();
		Gobax b = new Gobax(); b.go();
		Stone c = new Stone(); c.go();
	}
	
}

class Sente implements Go {
	public void go() { System.out.println("go in Sente."); }
}

class Gobax extends Sente {
	public void go() { System.out.println("go in Sente."); }
}

class Stone extends Sente implements Go {
	
}

interface Go { public void go(); } 
