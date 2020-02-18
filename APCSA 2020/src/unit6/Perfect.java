package unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number;
   private int count;

	public Perfect() {
		number = 0;
		count = 0;
	}
	
	public Perfect (int num) {
		setNums(num);
	}
	
	public void setNums (int num) {
		number = num;
	}

	public boolean isPerfect()
	{
		count = 0;
		
		for (int i = 1; i < number; i++)
		{
			int divisor = number%i;
			
			if (divisor == 0)
				count = count+i;
		}
		
		if (count == number) 
			return true;
		
		else 
			return false;
		
	}

	public String toString() { 
		
		if (isPerfect() == true)
			return number + " is perfect";
		else
			return number + " is not perfect";
	}
	
}