package practice.exams.java.chapter4.question5.g;

public class CartEntry {
	
	private Double price;
	private int quantity;

	public Double getLineItemTotal() {
		return price * quantity;
	}
}