package unit5;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;
import java.util.Scanner;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		Scanner input = new Scanner(System.in);
		
		//add test cases
		
		out.println("");
		String one = input.nextLine();
		out.println("");
		String two = input.nextLine();
		
		StringEquality test = new StringEquality(one, two);
		test.checkEquality();
		//test.print();
		System.out.println(test);
		
	}
}