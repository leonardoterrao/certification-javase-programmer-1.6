package practice.exams.java.chapter3.question44;

public class Later {

	public static void main(String[] args) {
		boolean earlyExit = new Later().test1(args);
		if (earlyExit) assert false;
		new Later().test2(args);
	}

	private boolean test1(String[] args) {
		if (args.length == 0) return false;
		return true;
	}

	private void test2(String[] args) {
		if (args.length == 2) assert false;
	}
	
}
