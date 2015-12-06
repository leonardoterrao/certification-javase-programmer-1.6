package utils.two;

import java.util.HashMap;
import java.util.Set;

public class NumberNames {

	private HashMap<String, Integer> map = new HashMap<String, Integer>();
	
	public void put(String name, int value) {
		map.put(name, value);
	}
	
	public Set<String> getNames() {
		return map.keySet();
	}

	public static void main(String[] args) {
		NumberNames nn = new NumberNames();
		nn.put("one", 1);
		System.out.println(nn.getNames());
	}
	
}
