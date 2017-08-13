package tr.org.linux.kamp.footballgame;

public abstract class Game  implements Playable{
	private boolean hasWinner;
	
	
	public Game(boolean hasWinner){
		this.hasWinner = hasWinner;
	}

	public boolean isHasWinner() {
		return hasWinner;
	}

	public void setHasWinner(boolean hasWinner) {
		this.hasWinner = hasWinner;
	}

	
	
	
}
