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

	public Distance()
	{
		xOne = 0;
		yOne = 0;
		xTwo = 0;
		yTwo = 0;
		distance = 0;
	}
	
	public Distance(int x1, int y1, int x2, int y2)
	{
		setCoordinates(x1, y1, x2, y2);
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
		int xDif = xTwo - xOne;
		int yDif = yTwo - yOne;
		double xPow = (double) Math.pow(xDif, 2);
		double yPow = (double) Math.pow(yDif, 2);
		distance = Math.sqrt(xPow + yPow);
	}

	
	public void print()
	{
		System.out.println("distance == " +String.format("%.3f", distance));
	}
	
	
	//complete print or the toString

	
}