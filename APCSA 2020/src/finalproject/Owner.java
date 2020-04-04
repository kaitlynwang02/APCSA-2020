package finalproject;
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Owner
{
	private String myName;
	private Weights mydogWeights;
	
	public Owner()
	{
		setName("");
		setWeights("");
	}
	
	public Owner(String name, String weight)
	{		
		setName(name);
		setWeights(weight);		
	}
	
	public void setName(String name)
	{
		myName = name;
	}	
	
	public void setWeights(String weight)
	{
		mydogWeights = new Weights(weight);
	}
	
	public void setWeightInd(int spot, double weight)
	{
		mydogWeights.setWeightInd(spot, weight);
	} 
	
	public Weights getWeight() 
	{
		return mydogWeights;
	}
	
	public String getName()
	{
		return myName;
	}
	
	public int getdogNum()
	{
		return mydogWeights.getdogNum();
	}

	public double getSum()
	{
		return mydogWeights.getSum();
	}
	
	public double getAverage()
	{
		return getSum()/getdogNum();
	}
	
	public double getHighGrade()
	{
		return mydogWeights.getHighWeight();		
	}
	
	public double getLowGrade()
	{
		return mydogWeights.getLowWeight();	
	}
	
	public String toString()
	{
		return myName + " = " + mydogWeights.toString();
	}	
	
}