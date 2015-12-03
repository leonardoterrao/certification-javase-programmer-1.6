package test.killer.troytec.question3;

public class Single {

	private static Single instance;
	public static Single getInstance() {
		if (instance == null) instance = create();
		return instance;
	}
	
	protected Single() {}
	
	static Single create() { return new Single(); }
}

class SubSingle extends Single {
}