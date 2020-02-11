package unit5;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringEquality
{
	private static String wordOne, wordTwo;
	private static boolean compare;

	public StringEquality()
	{
		wordOne = "";
		wordTwo = "";
	}

	public StringEquality(String one, String two)
	{
		setWords(one, two);
	}

	public void setWords(String one, String two)
	{
		wordOne = one;
		wordTwo = two;
	}

	public void checkEquality()
	{
		if (wordOne.equals(wordTwo))
		compare = true;
		else
		compare = false;
	}

	public void print() {
		if (compare = false)
			System.out.println(wordOne + " does not have the same letters as " + wordTwo + "\n");
		
		else if (compare = true)
			System.out.println(wordOne + " has the same letters as " + wordTwo + "\n");
	}
	
	public String toString()
	{
		if (compare = true)
		return wordOne + " does not have the same letters as " + wordTwo + "\n";
	
		else
		return wordOne + " has the same letters as " + wordTwo + "\n";
		
		
	}
	
}