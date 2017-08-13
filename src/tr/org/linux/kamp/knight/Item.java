package tr.org.linux.kamp.knight;

public abstract class Item {

	protected int itemQuantity;
	protected int itemPrice;
	protected double itemWeight;

	public Item(int itemQuantity, int itemPrice, double itemWeight) {
		this.itemQuantity = itemQuantity;
		this.itemPrice = itemPrice;
		this.itemWeight = itemWeight;
		itemQuantity++;
	}

	public abstract boolean useItem();

	public int getItemQuantity() {
		return itemQuantity;
	}

	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

	public int getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}

	public double getItemWeight() {
		return itemWeight;
	}

	public void setItemWeight(double itemWeight) {
		this.itemWeight = itemWeight;
	}

}
