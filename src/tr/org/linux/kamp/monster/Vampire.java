package tr.org.linux.kamp.monster;

public class Vampire extends Monster implements Fearer {

	public Vampire(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	void frighty() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void canMakeYouScare() {
		// TODO Auto-generated method stub
		
	}
	
	void bite(){
		System.out.println(getName()+ " adlı vampir ısırdı.");
	}
	
	void canBeScaredByGarlic(){
		System.out.println(getName()+ " adlı vampir korkutuldu");
	}

}
