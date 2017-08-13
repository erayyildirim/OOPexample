package tr.org.linux.kamp.knight;

public class Bow extends Weapon implements Upgradeable {
	protected int numOfArrows;

	public Bow(int itemQuantity, int itemPrice, double itemWeight,
			int damageAmount, int numOfArrows) {
		super(itemQuantity, itemPrice, itemWeight, damageAmount);
		this.numOfArrows = numOfArrows;
	}

	@Override
	public void upgrade() {
		numOfArrows = numOfArrows + 10;
		System.out.println("Bow upgrade edildi yeni ok sayısı: " + numOfArrows);

	}

	@Override
	public boolean useItem() {
		if (numOfArrows > 0) {
			System.out.println("Yay kullanılabilir " + numOfArrows
					+ " adet oka sahipsiniz");
			return true;

		} else
			return false;

	}

	@Override
	public String toString() {
		return "Bow [numOfArrows=" + numOfArrows + ", damageAmount="
				+ damageAmount + ", itemQuantity=" + itemQuantity
				+ ", itemPrice=" + itemPrice + ", itemWeight=" + itemWeight
				+ ", useItem()=" + useItem() + ", getDamageAmount()="
				+ getDamageAmount() + ", getItemQuantity()="
				+ getItemQuantity() + ", getItemPrice()=" + getItemPrice()
				+ ", getItemWeight()=" + getItemWeight() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	

}
