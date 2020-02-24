package unit7;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class BiggestDouble
{
	private double one,two,three,four;

	public BiggestDouble()
	{
		this(0,0,0,0);
	}

	public BiggestDouble(double a, double b, double c, double d)
	{
		setDoubles(a,b,c,d);
	}

	public void setDoubles(double a, double b, double c, double d)
	{
		one = a;
		two = b;
		three = c;
		four = d;
	}

	public double getBiggest()
	{
		if (four > three && four > two && four > one)
			return four;
		else if (three > four && three > two && three > one)
			return three;
		else if (two > four && two > three && two > one)
			return two;
		else if (one > four && one > three && one > two)
			return one;
		else 
			return 0.0;
	}

	public String toString()
	{
	   return "" + one + " " + two + " " + three + " " + four;
	}
} 