
public class EnumTest {

//	public enum Dogs {collie, harrier, shepherd};
//	
//	public static void main(String[] args) {
//		Dogs myDog = Dogs.shepherd;
//		switch (myDog) {
//		case collie:
//			System.out.println("collie");
//		default:
//			System.out.println("retriever");
//		case harrier:
//			System.out.println("harrier");
//		}
//	}

	public enum Dogs {
		collie, harrier, shepherd
	};

	public static void main(String[] args) {
		Dogs myDog = Dogs.shepherd;
		switch (myDog) {
		case collie:
			System.out.print("collie ");
	 // case default:
			System.out.print("retriever ");

		case harrier:

			System.out.print("harrier ");
		}
	}
	
}
