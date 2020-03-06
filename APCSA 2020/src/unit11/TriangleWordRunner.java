package unit11;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWordRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		TriangleWord test = new TriangleWord();
		System.out.println("Enter a word :: " );
		String word = keyboard.next();
		test.printTriangle(word);
				
		//fix this
		System.out.println("Do you want to enter more sample input? ");
		String choice = keyboard.next();
		while (choice.contentEquals("y")){
			System.out.println("Enter a word :: " );
			word = keyboard.next();
			test.printTriangle(word);
		}
		}
		
		
		
	}
