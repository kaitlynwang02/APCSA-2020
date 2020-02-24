package unit7;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
		this("");
	}

	public RockPaperScissors(String player)
	{
		setPlayers(player);
	}

	public void setPlayers(String player)
	{
		playChoice = player;
		
		double random = Math.random();	
		
		if (random < 0.33)
			compChoice = "R";
		else if (random > .33 && random < .67)
			compChoice = "P";
		else if (random > .67)
			compChoice = "S";
	}

	public String determineWinner()
	{
		String winner = "";
		if (compChoice.contentEquals("S")) {
			if (playChoice.contentEquals("S"))
				winner= "!Draw Game!";
			else if (playChoice.contentEquals("R"))
				winner = "!Player wins << Rock Breaks Scissors>>!";
			else if (playChoice.contentEquals("P"))
				winner = "!Computer wins <<Scissors Cuts Paper>>!";
		}
		if (compChoice.contentEquals("R")) {
			if (playChoice.contentEquals("S"))
				winner= "!Computer wins <<Rock Breaks Scissors>>!";
			else if (playChoice.contentEquals("R"))
				winner = "!Draw Game!";
			else if (playChoice.contentEquals("P"))
				winner = "!Player wins <<Paper Covers Rock>>!";
		}
		if (compChoice.contentEquals("P")) {
			if (playChoice.contentEquals("S"))
				winner= "!Player wins <<Scissors Cuts Paper>>!";
			else if (playChoice.contentEquals("R"))
				winner = "!Computer wins <<Paper Covers Rock>>!";
			else if (playChoice.contentEquals("P"))
				winner = "!Draw Game!";
		}
		return winner;
	}

	public String toString()
	{
		String output="Rock-Paper-Scissors - pick your weapon [R, P, S] :: " + playChoice + "\nplayer had " + playChoice + "\ncomputer had " + compChoice + "\n" + determineWinner();
		return output;
	}
} 