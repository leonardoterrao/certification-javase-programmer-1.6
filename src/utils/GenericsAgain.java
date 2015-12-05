package utils;

import java.util.ArrayList;
import java.util.List;

public class GenericsAgain {

	public static void main(String[] args) {
		ArrayList x4 = new ArrayList();
		foo(x4);
	}

	public static void foo(List<Object> list) {
	}
}
