package tr.org.linux.kamp.book;

public class HardCopyBook extends Book {

	protected double weight;
	protected double shippingCost;

	public HardCopyBook(String name, String author, double price,
			String bookId, double weight, double shippingCost) {
		super(name, author, price, bookId);
		this.weight = weight;
		this.shippingCost = shippingCost;
	}

	public double getTotalCost() {

		return price + shippingCost;

	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getShippingCost() {
		return shippingCost;
	}

	public void setShippingCost(double shippingCost) {
		this.shippingCost = shippingCost;
	}

}
