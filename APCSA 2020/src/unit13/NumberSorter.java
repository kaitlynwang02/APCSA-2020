package unit13;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays; 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSorter
{
	//instance variables and other methods not shown

	private static int getNumDigits(int number)
	{
		int count = 1;
		while (number>10)
		{
			number=number/10;
			count++;
		}
		return count;
	}

	public static int[] getSortedDigitArray(int number)
	{
		int numDig = getNumDigits(number);
		int[] sorted = new int[numDig];
		int sortedDig = 0;

		while (number > 0) 
		{
			int digit = number % 10;
			int index = sortedDig;
			
			while (index > 0 && digit < sorted[index - 1]) 
			{
				sorted[index] = sorted[index - 1];
				index--;
			}
			
			sorted[index] = digit;
			number /= 10;
			sortedDig++;
		}
		
		return sorted;
	}
}