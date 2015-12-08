package utils.four;

import java.util.*;

public class G1 {

	public static void main(String[] args) {
//		List<? extends G1> as = new ArrayList<G1>();
//		as.add(new G1());
	}
	
	public void takeList(List<? extends String> list) {
//		list.add("foo");
		Object o = list;
		String s = list.get(0);
		list = new ArrayList<String>();
//		list = new ArrayList<Object>();
	}
}