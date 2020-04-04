package finalproject;
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Weights
{
	private static ArrayList<Double> weights;
	
	public Weights()
	{
		setWeights("");
	}
	
	public Weights(String weight)
	{
		setWeights(weight);		
	}
	
	@SuppressWarnings("resource")
	public void setWeights(String weight)
	{
		
		double temp = 0.0;
		Scanner test = new Scanner(weight);
		weights = new ArrayList<Double>();
		
		int size = test.nextInt();
		//System.out.println(size);
		test.next();
		
		for (int i = 0; i < size; i++) {
			temp = test.nextDouble();
			//out.println(temp);
			weights.add(temp);
		}
		
	}
	
	public void setWeightInd(int index, double weight)
	{
		weights.set(index,  weight);
	}

	public double getSum()
	{
		
		double sum = 0.0;
		
		for(double weight : weights) 
		{
			sum = sum + weight;
		}
		
		return sum;
		
	}
	
	public double getLowWeight()
	{
		
		if(weights.size() == 0) 
			return 0.0;
		double low = weights.get(0);
		for (double weight : weights) 
		{
			if (low > weight)
				low = weight;
		}
		return low;
		
	}
	
	public double getHighWeight()
	{
		if(weights.size() == 0) 
			return 0.0;
		double high = weights.get(0);
		for (double weight : weights) 
		{
			if (high < weight)
				high = weight;
		}
		return high;
	}
	
	public int getdogNum()
	{
		return weights.size();
	}
	
	public int binarySearch(double target)
	{
			
		int left = 0;
	    int right = weights.size() - 1;
	    
	      while (left <= right)
	      {
	         int middle = (left + right) / 2;
	         if (target < weights.get(middle))
	         {
	            right = middle - 1;
	         }
	         else if (target > weights.get(middle))
	         {
	            left = middle + 1;
	         }
	         else {
	            return middle;
	         }
	       }
		
	    return -1;
	}

	public String obesity()
	{
		int temp = 0;
		for(int i = 0; i < weights.size(); i++)
		{
			if (weights.get(i) > 75.0)
				temp = i;
		}
		if (temp != 0)
			return "The obese dog's index is: " + temp;
		else
			return "none";
	}

	
	public String toString()
	{
		String output="";
		for (double weight : weights) 
		{
			output += weight + " ";
		}
		return output;
	}
	
}