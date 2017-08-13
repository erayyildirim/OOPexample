package tr.org.linux.kamp.footballgame;

import java.awt.Color;

public class FootballRules extends Football {
	
	private int scoresOfHomeTeam;
	private int scoresOfGuestTeam;
	
	
	private FootballClub HomeTeam;
	private FootballClub GuestTeam;
	
	public FootballRules(boolean hasWinner,boolean hasHoliganizm) {
		super(hasWinner,hasHoliganizm);
		// TODO Auto-generated constructor stub
		
	}
	
	
	

	public FootballClub getAsHomeTeam() {
		return HomeTeam;
	}

	public void setAsHomeTeam(FootballClub asHomeTeam) {
		this.HomeTeam = asHomeTeam;
	}

	public FootballClub getAsGuestTeam() {
		return GuestTeam;
	}

	public void setAsGuestTeam(FootballClub asGuestTeam) {
		this.GuestTeam = asGuestTeam;
	}



	@Override
	public void hasOpponent() {
		
	}

	@Override
	void moveToBall(FootballClub team) {
		System.out.println(team.getClubName() + " topu sürüyor");
		
		
	}

	




	@Override
	void anOpponentScores(FootballClub team) {
		// TODO Auto-generated method stub
		if(team.equals(GuestTeam)){
			scoresOfGuestTeam++;
			System.out.println("Konuk ekip golü attı" + "\n" + team.getClubName()+ " " + scoresOfGuestTeam);
		}else if(team.equals(HomeTeam)){
			scoresOfHomeTeam++;
			System.out.println("Ev sahibi golü attı" + "\n" + team.getClubName() +" "+ scoresOfHomeTeam );
			
		}else{
		
		}
		
	}




	public int getScoresOfHomeTeam() {
		return scoresOfHomeTeam;
	}




	public void setScoresOfHomeTeam(int scoresOfHomeTeam) {
		this.scoresOfHomeTeam = scoresOfHomeTeam;
	}




	public int getScoresOfGuestTeam() {
		return scoresOfGuestTeam;
	}




	public void setScoresOfGuestTeam(int scoresOfGuestTeam) {
		this.scoresOfGuestTeam = scoresOfGuestTeam;
	}
	
	
	public void endoffirstHalf(){
		System.out.println("İlk yarı sona erdi");
		
	}
	
	public void endofTheGame(){
		System.out.println("Maç ona erdi");
		
	}



	
	

}
