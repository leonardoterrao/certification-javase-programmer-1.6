package practice.exams.java.chapter4.question1.f;

public class EnumExamples {

	public static void main(String[] args) {
		for (Option option : Option.values()) {
			option.printValue();
			System.out.println(option.whoIsYou());
		}
		
		Option.OPTION1.printValue();
		System.out.println(Option.OPTION1.whoIsYou());
	}

}
