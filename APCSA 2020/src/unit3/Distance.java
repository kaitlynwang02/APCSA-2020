package unit3;
//(c) A+ Computer Science 
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private int xOne,yOne,xTwo,yTwo;
	private double distance;
	private int xDif;
	private int yDif;

	public Distance()
	{
		xDif = xTwo - xOne;
		yDif = yTwo - yOne;
	}
	
	public Distance(int x1, int y1, int x2, int y2)
	{
		setCoordinates(x2, y1, x2, y2);
	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
	}

	public void calcDistance()
	{
		distance = (double)Math.sqrt(Math.pow(xDif, xDif) + Math.pow(yDif, yDif));
	}

	
	public void print()
	{
		System.out.println("distance == " +distance);
	}
	
	//complete print or the toString

	public String toString()
	{
		return "distance ==" +distance;
	}
}