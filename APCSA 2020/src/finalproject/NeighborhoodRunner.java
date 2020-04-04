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

import java.io.File;
import java.io.IOException;

public class NeighborhoodRunner
{
   public static void main( String args[] ) throws IOException
   {
	   out.println("Welcome to the Neighborhood Dogs program!");
		
		Scanner file = new Scanner(new File("src/finalproject/dogs.dat"));
		String neighborhoodName = file.nextLine();
		int numOwners = file.nextInt();
		file.nextLine();
		
		//out.println(neighborhoodName);
		//out.println(numOwners);
		
		Neighborhood theNeighborhood = new Neighborhood(neighborhoodName, numOwners);
		
		for(int i=0; i<numOwners; i++)
		{
			String ownName = file.nextLine();
			String weightsList = file.nextLine();			
			theNeighborhood.addOwner(i,new Owner(ownName, weightsList));
		}
		
		out.println("\n\n"+theNeighborhood);
		theNeighborhood.sort();
		out.println("\n\n"+theNeighborhood);
		
		out.println("Owners with Dogs at Perfect Weight = " + theNeighborhood.target());
		//out.println("Owners with Obese Dogs = " + )
		out.println("Highest Average = " + theNeighborhood.getOwnerWithHighestAverage());
		out.println("Lowest Average = " + theNeighborhood.getOwnerWithLowestAverage());
		
		out.println("Neighborhood Average = " + theNeighborhood.getNeighborhoodAverage());
 }
	
}