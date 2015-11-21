package practice.exams.java.chapter4.question1.d;

public class StaticBlocks extends SuperStatic{
	
	static {
		System.out.println("A");
	}

	{
		System.out.println("B");
	}
	
	public StaticBlocks() {
		System.out.println("C");
	}

	public static void main(String[] args) {
		new StaticBlocks();
	}

	/*
	 result
	 
	 SUPER A
	 A
	 SUPER B
	 SUPER C
	 B
	 C
	 */
	
}
