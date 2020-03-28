package unit13;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class WordSortTwo
{
	private String[] wordRay;

	public WordSortTwo(String sentence)
	{
		wordRay = sentence.split(" ");
	}

	public void sort()
	{
		for (int i = 1; i < wordRay.length; i++) 
		{
			int beforeIndex = i - 1;	
			while (beforeIndex > - 1 && wordRay[i].compareTo(wordRay[beforeIndex]) < 0)
			{
				beforeIndex--;
			}
			
			String temp = wordRay[i];
			
			for (int j = i - 1; j > beforeIndex; j--) wordRay[j + 1] = wordRay[j];
			{
			wordRay[beforeIndex + 1] = temp;
			}
		}
	}

	public String toString()
	{
		String output = "";
		for (String word : wordRay)
		{
			output += word + "\n";
		}
		return output + "\n\n";
	}
}