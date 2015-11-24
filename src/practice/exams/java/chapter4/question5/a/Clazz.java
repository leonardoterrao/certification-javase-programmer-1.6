package practice.exams.java.chapter4.question5.a;

public class Clazz {

	public static void main(String[] args) {
		new Clazz();
	}
	
	public Clazz() {
		
		method(1);
		method(1, 2);
		method(1, 2 , 3);
		method(new Integer(2), new Integer(2) , new Integer(2), new Integer(2));
		method(new Integer(2), new Integer(4));
		method(new Integer(4));
		method(new Integer(4), 15);
		method(new Double(5.2));
		method(1.0d);
		method(1999999999);
		method(2999999999l);
		method(new Byte((byte) 5));
		method(5l);
		method(new Long(50));
		method((byte) 50);
		method((byte) 50, (byte) 50, (byte) 50, (byte) 50);
		
		short s1 = 5;
		short s2 = 5;
		short s3 = 5;
		
		method(s1, s2, s3);
		
	}
	
	protected void method(int int1, int int2) {
		System.out.println("int, int");
	}
	
	protected void method(double double1, double double2) {
		System.out.println("double, double");
	}
	
	protected void method(Double double1, Double double2) {
		System.out.println("Double, Double");
	}
	
	protected void method(Integer integer1, Integer integer2) {
		System.out.println("Integer, Integer");
	}
	
	protected void method(Integer integer1, int integer2) {
		System.out.println("Integer, Integer");
	}
	
	protected void method(short shor) {
		System.out.println("short");
	}

	protected void method(int inti) {
		System.out.println("int");
	}
	
	protected void method(int... inti) {
		System.out.println("int...");
	}
	
	protected void method(byte byt) {
		System.out.println("byte");
	}
	
	protected void method(long longg) {
		System.out.println("long");
	}
	
	protected void method(Long longg) {
		System.out.println("Long");
	}
	
	protected void method(Short shortt) {
		System.out.println("Short");
	}
	
	protected void method(Double doublee) {
		System.out.println("Double");
	}
	
	protected void method(double doublee) {
		System.out.println("double");
	}
	
	protected void method(Integer integer) {
		System.out.println("Integer");
	}
	
	protected void method(short... integer) {
		System.out.println("short...");
	}
	
}
