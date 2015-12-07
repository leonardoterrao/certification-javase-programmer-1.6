package utils.three;

public class Blip {
	protected int blipvert(int x) {return 0;}
}

class Vert extends Blip {
	public int blipvert(int x) { return 0; }            //A. 
//	private int blipvert(int x) { return 0; }           //B. 
//	private int blipvert(long x) { return 0; }          //C. 
//	protected long blipvert(int x) { return 0; }        //D. 
	protected int blipvert(long x) { return 0; }        //E. 
//	protected long blipvert(long x) { return 0; }       //F. 
	protected long blipvert(int x, int y) { return 0; } //G. 

}