package tr.org.linux.kamp.monster;

public class Test {
	public static void main(String[] args) {
		
		Dragon dragon1 = new Dragon("Ahmet");
		System.out.println(dragon1.getName() + " adlı dragon geldi");
		dragon1.fly();
		dragon1.breathFire();
		
		Vampire vampire1 = new Vampire("Mehmet");
		System.out.println(vampire1.getName() + " adlı vampir geldi");
		vampire1.bite();
		vampire1.canBeScaredByGarlic();
		
		
	}

}
