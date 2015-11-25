package practice.exams.java.chapter4.question5.g;

public class Order {

	private CartContents cart;
	private Double salesTax;

	public Order(CartContents cart, Double salesTax) {
		this.cart = cart;
		this.salesTax = salesTax;
	}

	public Double OrderTotal() {
		return cart.getCartItemsTotal() * (1.0 + salesTax);
	}
}