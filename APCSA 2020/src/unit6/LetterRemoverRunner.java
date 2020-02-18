package unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemoverRunner
{
	public static void main( String args[])
	{

		LetterRemover test1 = new LetterRemover("I am Sam I am", 'a');
		System.out.println(test1);
		System.out.println(test1.removeLetters());
		System.out.println("");
		
		LetterRemover test2 = new LetterRemover("ssssssssxssssesssssesss", 's');
		System.out.println(test2);
		System.out.println(test2.removeLetters());
		System.out.println("");
		
		LetterRemover test3 = new LetterRemover("qwertyqwertyqwerty", 'a');
		System.out.println(test3);
		System.out.println(test3.removeLetters());
		System.out.println("");
		
		LetterRemover test4 = new LetterRemover("abababababa", 'b');
		System.out.println(test4);
		System.out.println(test4.removeLetters());
		System.out.println("");
		
		LetterRemover test5 = new LetterRemover("abaababababa", 'x');
		System.out.println(test5);
		System.out.println(test5.removeLetters());
		System.out.println("");
											
	}
}