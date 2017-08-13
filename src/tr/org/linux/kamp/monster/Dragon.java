package tr.org.linux.kamp.monster;

public class Dragon extends Monster implements Flyable {
	
	
	public Dragon(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	void breathFire(){
		System.out.println(getName() + " adlı dragon ateş saçtı.");
	}

	@Override
	void frighty() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println(getName() + " adlı dragon uçtu.");
		
	}

}
