package tr.org.linux.kamp.footballgame;

import java.awt.Color;

public class FootballApp {
	public static void main(String[] args) {
		
		
		FootballClub fb = new FootballClub("FB", Color.black, 1500, "df", 1500);
		FootballClub bjk = new FootballClub("BJK", Color.black, 1500, "dddf", 1500);
		
		FootballRules mac = new FootballRules(true, true);
		
		mac.setAsGuestTeam(fb);
		mac.setAsHomeTeam(bjk);
		
		mac.anOpponentScores(fb);
		mac.anOpponentScores(fb);
		mac.endoffirstHalf();
		
		mac.moveToBall(fb);
		mac.anOpponentScores(fb);
		mac.moveToBall(bjk);
		mac.anOpponentScores(bjk);
		
		mac.endofTheGame();
		int guestGoals = mac.getScoresOfGuestTeam();
		int	homeGoals = mac.getScoresOfHomeTeam();
		System.out.println("Mac sonucu  " + fb.getClubName() + " " + guestGoals + " - " +bjk.getClubName() + " " + homeGoals );
		
		
		
	
		
		
		
		
	}

}
