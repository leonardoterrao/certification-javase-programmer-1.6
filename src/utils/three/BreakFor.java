package utils.three;

public class BreakFor {
	
	public static void main(String[] args) {
		new BreakFor().go();
		
//		String[] elements = { "for", "tea", "too" };
//		String first = (elements.length > 0) elements[0] : null;
		
	}
	
	public void go() {
		String o = "";
		z: for (int x = 0; x < 3; x++) {
			for (int y = 0; y < 2; y++) {
				if (x == 1)
					break;
				if (x == 2 && y == 1)
					break z;
				o = o + x + y;	
			}
		}
		System.out.println(o);
	}
}
