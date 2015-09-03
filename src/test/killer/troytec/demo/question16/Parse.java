package test.killer.troytec.demo.question16;

public class Parse {

	public static void main(String[] args) {
		parse("invalid");
	}

	private static void parse(String string) {

		float f = 0;
		try {
			f = Float.parseFloat(string);
		} catch (NumberFormatException nfe) {
			f = 0;
		} finally {
			System.out.println(f);
		}
	}
}
