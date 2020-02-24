package unit7;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class Triples
{
   private static int number;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		setNum(num);
	}

	public void setNum(int num)
	{
		number = num;
	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int max = 1;
		int count = 1;
		while (count <= a) {
			if (a % count == 0 && b % count == 0 && c % count == 0)
				max = count;
		count++;
		}
		return max;
	}

	public String toString()
	{
		String output = "";
		
		
		for (int a = 1; a <= number; a++) {
			for (int b = a + 1; b <= number; b = b+2) {
				for (int c = a + 2; c <= number; c++) {
					if (c%2 == 0)
					{ 
						c++;
					}
					if (Math.pow(a, 2) + Math.pow(b,  2) == Math.pow(c,  2) && greatestCommonFactor(a,b,c) == 1) 
					{ 
						output = output + a + " " + b + " " + c + "\n";
					}
				}
			}
		}
		
		/*int a = 0, b = 0, c = 0;
		int num = 1;
		
		if (greatestCommonFactor(a, b, c) == 1) {
			
		while (num <= number) {			
			a = num;
			int num2 = a+1;
				while (Math.sqrt(Math.pow(a, 2) + Math.pow(num2, 1))%2 != 1)
					num2 = num2+2;
				b = num2;
				c = (int) Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
			num++;
		}
	}
		return a + b + c + "";*/
		
		return output;
	}
} 