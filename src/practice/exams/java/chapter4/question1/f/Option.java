package practice.exams.java.chapter4.question1.f;

public enum Option {
	OPTION1("1") {
		@Override
		String whoIsYou() {
			return "I am OPTION 1";
		}
	},
	OPTION2("2") {
		@Override
		String whoIsYou() {
			return "I am OPTION 2";
		}
	},
	OPTION3("3") {
		@Override
		String whoIsYou() {
			return "I am OPTION 3";
		}
	};
	
	String value;
	
	private Option(String value) {
		this.value = value;
	}
	
	public void printValue() {
		System.out.println(value);
	}
	
	abstract String whoIsYou();
}