package tr.org.linux.kamp.footballgame;

import java.awt.Color;

public abstract class Club {
	private String clubName;
	private Color colors;
	protected int clubValue;
	
	
	
	
	public Club(String clubName, Color colors, int clubValue) {
		this.clubName = clubName;
		this.colors = colors;
		this.clubValue = clubValue;
	}
	
	
	public String getClubName() {
		return clubName;
	}
	public void setClubName(String clubName) {
		this.clubName = clubName;
	}
	public Color getColors() {
		return colors;
	}
	public void setColors(Color colors) {
		this.colors = colors;
	}
	public int getClubValue() {
		return clubValue;
	}
	public void setClubValue(int clubValue) {
		this.clubValue = clubValue;
	}
	
	
	

}
