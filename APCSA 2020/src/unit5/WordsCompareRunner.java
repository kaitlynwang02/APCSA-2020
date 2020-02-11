package unit5;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
	   Scanner input = new Scanner(System.in);
	   
	   //add test cases
	   System.out.println("");
	   String one = input.nextLine();
	   
	   System.out.println("");
	   String two = input.nextLine();
	   
	   WordsCompare test = new WordsCompare(one, two);
	   test.compare();
	   System.out.println(test);
	}
}