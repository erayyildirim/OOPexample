package tr.org.linux.kamp.monster;

public abstract class Monster {
	
	private String name;
	abstract void frighty();
	
	public Monster(String name){
		this.name = name;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
