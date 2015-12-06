package utils.two;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class FooSerialization implements Serializable {

	public int x, y;
	public FooSerialization(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	private void writeObjetc(ObjectOutputStream s) throws IOException {
		s.writeInt(x);
		s.writeInt(y);
	}
	
	private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException {
		x = s.readInt();
		y = s.readInt();
	}
	
}
