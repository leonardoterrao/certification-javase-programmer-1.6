import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Clazz {

	public static void main(String[] args) {
		
//		String s = "123456789";
//		s = (s-"123").replace(1,3,"24") - "89";
		
		StringBuffer s1 = new StringBuffer("123456789");
		s1.delete(0,3).replace(1,3,"24").delete(4,6);
		
//		StringBuffer s2 = new StringBuffer("123456789");
//		s2.substring(3,6).delete(1,3).insert(1, "24");
//		
//		StringBuilder s3 = new StringBuilder("123456789");
//		s3.substring(3,6).delete(1,2).insert(1, "24");
//		
		StringBuilder s4 = new StringBuilder("123456789");
		s4.delete(0,3).delete(1,3).delete(2,5).insert(1, "24");
		
		System.out.println(s1);
		System.out.println(s4);
	}
}
