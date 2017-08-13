package tr.org.linux.kamp.knight;


public class Armor extends Item implements Upgradeable {

	protected int defensePoints;
	protected boolean isWorn = false;

	public Armor(int itemQuantity, int itemPrice, double itemWeight,
			int defensePoints, boolean isWorn) {
		super(itemQuantity, itemPrice, itemWeight);
		this.isWorn = isWorn;
		this.defensePoints = defensePoints;

	}

	@Override
	public void upgrade() {
		defensePoints = defensePoints + 100;
		System.out.println("Armor upgrade edildi yen defans: " + defensePoints);

	}

	@Override
	public boolean useItem() {
		// TODO Auto-generated method stub
		return false;
	}

	public void getHit(int damage) {
		if (isWorn) {
			if (defensePoints > damage) {
				defensePoints = defensePoints - damage;
			} else {
				defensePoints = 0;
				System.out.println("Armor parçalandı");
			}

		}

		System.out.println("Kalan defans: " + defensePoints);

	}

}
