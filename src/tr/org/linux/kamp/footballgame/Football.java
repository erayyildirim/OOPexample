package tr.org.linux.kamp.footballgame;

public abstract class Football extends BallGame {
	
	
	
	private boolean hasHoliganizm;

	
	public Football(boolean hasWinner, boolean hasHoliganizm) {
		super(hasWinner);
		// TODO Auto-generated constructor stub
		this.hasHoliganizm = hasHoliganizm;
	}
	

}
