package unit7;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		String response;
		
			String player = "";
		
			out.print("type in your prompt [R,P,S] :: ");
			player = keyboard.nextLine();
			
			//read in the player value
		
			RockPaperScissors game = new RockPaperScissors(player);
			System.out.println(game);
			
			out.println("\n\nDo you want to play again? ");
			response = keyboard.nextLine(); 
			
			while (response.contentEquals("y")) {
				out.print("type in your prompt [R,P,S] :: ");
				player = keyboard.nextLine();
				RockPaperScissors game1 = new RockPaperScissors(player);
				System.out.println(game1);
				
				out.println("\n\nDo you want to play again? ");
				response = keyboard.nextLine();
			}
	}
}
 


