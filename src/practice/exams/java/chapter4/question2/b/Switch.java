package practice.exams.java.chapter4.question2.b;

public class Switch {

	enum Option {
		OPTION1, OPTION2, OPTION3;
	}

	public static void main(String[] args) {
		Option option = Option.valueOf("OPTION3");
		caseOne(option);
		caseTwo(option);
		caseThree(option);
		caseFour(option);
		caseFive(option);
		caseSix(option);
	}

	private static void caseOne(Option option) {
		switch (option) {
		case OPTION1:
			System.out.print("option1 ");
			break;
		case OPTION2:
			System.out.print("option2 ");
			break;
		case OPTION3:
			System.out.print("option3 ");
			break;
		default:
			System.out.print("invalid option ");
			break;
		}
	}

	private static void caseTwo(Option option) {
		System.out.println("");
		switch (option) {
		case OPTION1:
			System.out.print("option1 ");
		case OPTION2:
			System.out.print("option2 ");
		case OPTION3:
			System.out.print("option3 ");
		default:
			System.out.print("invalid option ");
		}
	}

	private static void caseThree(Option option) {
		System.out.println("");
		switch (option) {
		case OPTION1:
		case OPTION2:
		case OPTION3:
			System.out.print("option 1 2 3 ");
		default:
			System.out.print("invalid option ");
		}
	}

	private static void caseFour(Option option) {
		System.out.println("");
		switch (option) {
		case OPTION1:
		case OPTION2:
		case OPTION3:
			System.out.print("option 1 2 3 ");
			break;
		default:
			System.out.print("invalid option ");
			break;
		}
	}

	private static void caseFive(Option option) {
		System.out.println("");
		switch (option) {
		case OPTION1:
			System.out.print("option 1 ");
		default:
			System.out.print("invalid option ");
			break;
		case OPTION2:
		case OPTION3:
			System.out.print("option 2 3 ");
			break;
		}
	}

	private static void caseSix(Option option) {
		System.out.println("");
		switch (option) {
		case OPTION1:
			System.out.print("option 1 ");
		default:
			System.out.print("invalid option ");
		case OPTION2:
		case OPTION3:
			System.out.print("option 2 3 ");
			break;
		}
	}
}
