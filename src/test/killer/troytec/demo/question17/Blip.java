package test.killer.troytec.demo.question17;

public class Blip {

	protected int blipvert(int x) { return 0; }

}

class Vert extends Blip {
//	public int blipvert(int x) { return 0; }
//	private int blipvert(int x) { return 0; } 
//	private int blipvert(long x) { return 0; }
//	protected long blipvert(int x) { return 0; }
//	protected int blipvert(long x) { return 0; }
	protected long blipvert(long x) { return 0; }
	protected long blipvert(int x, int y) { return 0; }
	protected Blip blipvert(String s) { return null; }
	protected String blipvert(Object s) { return null; }
}

