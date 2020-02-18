package unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class TriangleOne
{
	private String word;

	public TriangleOne()
	{
		word= "";
	}

	public TriangleOne(String s)
	{
		setWord(s);
		print();
	}

	public void setWord(String s)
	{
		word = s;
	}

	public void print ()
	{
		for (int i = word.length(); i >= 0; i--)
		{
			System.out.println(word.substring(0, i));
		}
	}
}