package unit11;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{
		//point pups at a new array of Dog
		pups = new Dog[size];
		
	}
	
	public void set(int spot, int age, String name)
	{
		//put a new Dog in the array at spot 
		//make sure spot is in bounds		
		if (spot < pups.length)
		pups[spot] = new Dog(age, name);
		
	}

	public String getNameOfOldest()
	{
		int x = 0;
		for (int i = 0; i < pups.length-1; i++) {
				if (pups[i].getAge() > pups[i+1].getAge()) {
					x = i;
				}
		}
		return pups[x].getName();
	}

	public String getNameOfYoungest()
	{
		int y = 0;
		for (int i = pups.length-1; i > 0; i--) {
				if (pups[i].getAge() < pups[i-1].getAge()) {
					y = i;
				}
		}
		return pups[y].getName();
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}