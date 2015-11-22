package practice.exams.java.chapter4.question3.a;

public class Parses {

	public static void main(String[] args) {
		integer();
		doble();
	}

	private static void integer() {
		Integer integer = 10;
		System.out.println(integer.byteValue());
		System.out.println(integer.doubleValue());
		System.out.println(integer.intValue());
		System.out.println(integer.floatValue());
		System.out.println(integer.longValue());
		
		System.out.println(Integer.parseInt("150"));
		System.out.println(Integer.valueOf(50));
		System.out.println(Integer.valueOf("50"));
		System.out.println(Integer.valueOf("500", Character.MAX_RADIX));

		System.out.println(new Integer(12));
		System.out.println(new Integer("12"));
	}
	
	private static void doble() {
		Double d = 10.6;
		System.out.println(d.doubleValue());
		System.out.println(d.longValue());
		System.out.println(d.byteValue());
		System.out.println(d.floatValue());
		System.out.println(d.intValue());
	}
	
}
