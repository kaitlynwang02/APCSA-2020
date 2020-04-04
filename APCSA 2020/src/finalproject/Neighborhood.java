package finalproject;
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;

import finalprojectexample.Student;

import static java.lang.System.*;
import static java.util.Arrays.*;
import java.util.ArrayList;

public class Neighborhood
{
	private String name;
	private ArrayList<Owner> ownerList;
	
	public Neighborhood()
	{
		name = "";
		ownerList = new ArrayList<Owner>();
	}
	
	public Neighborhood(String name, int ownCount)
	{
		this.name = name;
		ownerList = new ArrayList<Owner>();
	}
	
	public void addOwner(int ownNum, Owner o)
	{
		ownerList.add(o);
	}
	
	public String getNeighborhoodName()
	{
	   return name;	
	}
	
	public double getNeighborhoodAverage()
	{
		double classAverage = 0.0;
		for (Owner s : ownerList)
		{
			classAverage = classAverage+s.getAverage();
		}
		return classAverage/ownerList.size();
	}
	

	public double getOwnerAverage(String ownName)
	{
		
		for (Owner s : ownerList)
		{
			if (s.getName().contentEquals(ownName))
				return s.getAverage();
		}

		return 0.0;
	}
	
	public String getOwnerName(int ownNum)
	{
		return ownerList.get(ownNum).getName();
	}

	public String getOwnerWithHighestAverage()
	{
		return ownerList.get(ownerList.size()-1).getName();
	}

	public String getOwnerWithLowestAverage()
	{
		return ownerList.get(0).getName();
	}
	
	public void sort()
	{
		
		for (int i = 0; i < ownerList.size(); i++) {
            // find position of smallest num between (i + 1)th element and last element
            int pos = i;
            for (int j = i; j < ownerList.size(); j++) {
                if (getOwnerAverage(ownerList.get(j).getName()) < getOwnerAverage(ownerList.get(pos).getName()))
                    pos = j;
            }
            // Swap min (smallest num) to current position on array
            Owner min = ownerList.get(pos);
            ownerList.set(pos, ownerList.get(i));
            ownerList.set(i, min);
        }
		
	}
	
	public String[] target()
	{
		String[] targetNames = new String[0];
		for (int i = 0; i < targetNames.length; i++) {
		for (Owner o : ownerList)
		{
			if (o.getWeight().binarySearch(65.0) != -1)
				targetNames[i] = o.getName();
		}
		}
		return targetNames;
	}
	
	public String toString()
	{
		String output=""+getNeighborhoodName()+"\n";
		for (Owner s : ownerList)
		{
			output +=s+"\t"+String.format("%.2f", s.getAverage())+"\n";
		}
		return output;
	}  	
}