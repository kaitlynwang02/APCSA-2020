package unit13;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifterRunner
{
	public static void main( String args[] ) throws IOException
	{
		NumberShifter test1 = new NumberShifter();
		int size = 25;
		int[]test = test1.makeLucky7Array(size);
		
		System.out.print("Original Array: [");
		for (int i = 0; i<=size-1; i++)
		{
			if (i<size-1)
			{
				System.out.print(test[i]);
				System.out.print(", ");
			}
			else
				System.out.print(test[i]);
		}
		System.out.println("]");
		
		
		
		test1.shiftEm(test);
		System.out.print("7Shifted Array: [");
		for (int i = 0; i<=size-1; i++)
		{
			if (i<size-1)
			{
				System.out.print(test[i]);
				System.out.print(", ");
			}
			else
				System.out.print(test[i]);
		}
		System.out.print("]");
		
	}
}