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

public class MilesPerHour
{
	private int distance, hours, minutes;
	private double mph;

	public MilesPerHour(int dist, int hrs, int mins)
	{
		setNums(dist, hrs, mins);
	}

	public void setNums(int dist, int hrs, int mins)
	{
		distance = dist;
		hours = hrs;
		minutes = mins;
	}

	public void calcMPH()
	{
		mph = (double)distance/((hours*60) + minutes);
	}

	public void print()
	{
		System.out.println(distance + " miles in "+ hours + " hour and "+ minutes + " minutes = "+ mph + " MPH");
	}
	
	//create a print or toString or both
	
	public String toString()
	{
		return distance + " miles in "+ hours + " hour and "+ minutes + " minutes = "+ mph + " MPH";
	}
}