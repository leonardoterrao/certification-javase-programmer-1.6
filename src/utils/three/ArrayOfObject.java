package utils.three;

import java.util.Arrays;

public class ArrayOfObject {
	Object[] myObjects = { new Integer(12), new String("foo"), new Integer(5), new Boolean(true) };

	public ArrayOfObject() {
		Arrays.sort(myObjects);
		for (int i = 0; i < myObjects.length; i++) {
			System.out.print(myObjects[i].toString());
			System.out.print(" ");
		}
	}
	
	public static void main(String[] args) {
		new ArrayOfObject();
	}

}