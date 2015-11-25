package practice.exams.java.chapter4.question5.g;

import java.util.ArrayList;
import java.util.List;

public class CartContents {
	
	private List<CartEntry> items = new ArrayList<CartEntry>();

	public Double getCartItemsTotal() {
		Double cartTotal = 0.0;
		for (CartEntry item : items) {
			cartTotal += item.getLineItemTotal();
		}
		
		return cartTotal;
	}
}