package practice.exams.java.chapter2.question12;

class One {
	int x = 0;
	{ assert x == 1; }
}

public class Two {
	
	public static void main(String[] args) {
		int y = 0;
		assert y == 0;
		if (args.length > 0)
			new One();
	}

}
