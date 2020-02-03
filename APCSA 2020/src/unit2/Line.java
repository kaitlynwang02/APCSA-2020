package unit2;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class Line
{
	public static double getSlope( int x1, int y1, int x2, int y2 )
	{
		double ySlope = (y2 - y1);
		double xSlope = (x2 - x1);
		double slope = ySlope/xSlope;
		return slope;
	}

}