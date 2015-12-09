package utils.seven;

public class Update {

	public static void main(String[] args) {
		new Update().callUpdate();
	
		String s = new String("2");
		String s2 = new String("2");
		System.out.println(s == s2);
		System.out.println("1" == "1");
		
		System.out.println(1 == new Integer(1));
	}

	private void callUpdate() {
		int quant = 100;
		quant = update(quant, 320);
		System.out.println("The quantity is " + quant);
	}

	private int update(int quantity, int adjust) {
		quantity = quantity + adjust;
		return quantity;
	}
	
}
