package tr.org.linux.kamp.knight;

public abstract class Weapon extends Item {

	protected int damageAmount;

	public Weapon(int itemQuantity, int itemPrice, double itemWeight,
			int damageAmount) {
		super(itemQuantity, itemPrice, itemWeight);
		this.damageAmount = damageAmount;

	}

	public int getDamageAmount() {
		return damageAmount;
	}

	public void setDamageAmount(int damageAmount) {
		this.damageAmount = damageAmount;
	}
	
	

}
