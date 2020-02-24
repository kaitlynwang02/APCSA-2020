package unit7;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
		this('A', 0);
	}

	public TriangleFive(char c, int amt)
	{
		setLetter(c);
		setAmount(amt);
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}

	public String shape()
	{
		for (int a = amount; a >= 1; a--)
		{
			for (int b = 1; b <= a; b++)
			{
				for (int c = b; c <= amount; c++)
				{
					if (letter+b>91)
						System.out.print((char) (letter+b-1-26));
					else
						System.out.print((char) (letter+b-1));
				}
				System.out.print(" ");
			}
			System.out.println();
		}
		return "";
	}
	
	public String toString()
	{
		String output = shape();
		
		/*String value = letter + "";
		int charValue = value.charAt(0);
		
		int x = 0;
		
		for (int a = 0; a < amount; a++) {
			System.out.print(letter);
			x++;
			
			if (x == amount)
				for (int b = 0; b < amount-1; b++) {
					System.out.print(String.valueOf((char) (charValue + 1)));
					x++;
					
					if (x==amount+(amount-1))
						for (int c = 0; c < amount-2; c++) {
							System.out.print(String.valueOf((char) (charValue + 2)));
							x++;
							
							if (x==amount+(amount-2))
								for (int d = 0; d < amount-3; d++) {
									System.out.print(String.valueOf((char) (charValue + 3)));
									x++;
									
									if (x==amount+(amount-3))
										for (int e = 0; e < amount-4; e++) {
											System.out.print(String.valueOf((char) (charValue + 4)));
											x++;
								}
						}
						
				}
		}
	}
		
		
		out.print(" ");
		
		for (int i = 0; i < amount-1; i++) {
			System.out.print(String.valueOf((char) (charValue + 1)));
		}
		
		out.print(" ");
		
		for (int i = 0; i < amount-2; i++) {
			System.out.print(String.valueOf((char) (charValue + 2)));
		}
		
		out.print(" ");
		
		for (int i = 0; i < amount-3; i++) {
			System.out.print(String.valueOf((char) (charValue + 3)));
		}*/

		
		return output;
		
	}
} 