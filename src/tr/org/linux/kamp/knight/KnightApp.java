package tr.org.linux.kamp.knight;


public class KnightApp {
	public static void main(String[] args) {

		Armor armor = new Armor(1, 1000, 4.5, 1000, true);
		Bow bow = new Bow(1, 500, 3.0, 100, 50);
		Sword sword = new Sword(1, 2000, 5.0, 1000);
		armor.upgrade();
		bow.upgrade();
		System.out.println("Bow damage amount : " + bow.getDamageAmount());
		System.out.println("Sword damage amount : " + sword.getDamageAmount());
		System.out.println("Armor'a ok fırlatıldı");
		armor.getHit(bow.getDamageAmount());
		System.out.println("Armora bıçak isabet etti");
		armor.getHit(sword.getDamageAmount());
		System.out.println(bow.toString());
		
	}

}
