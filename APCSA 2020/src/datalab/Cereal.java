package datalab;

public class Cereal 
{
	private String name;
	private int calories;
	private int protein;
	
	public Cereal() 
	{
		name = "Fake Cereal Brand";
		calories = 0;
		protein = 0;
	}
	
	public Cereal(String n, int c, int p) 
	{
		name = n;
		calories = c;
		protein = p;
	}
	
	public int score() 
	{
		return (protein * 100 - calories) / calories;
	}
	
	public int inversescore() {
		return calories/(protein * 100 - calories);
	}

	public int getcalories() 
	{
		return calories;
	}

	public int getProtein() 
	{
		return protein;
	}
	
	public String getName() 
	{
		return name;
	}

	public void setcalories(int c) 
	{
		calories = c;
	}

	public void setProtein(int p) 
	{
		protein = p;
	}
	
	public void setName(String n) 
	{
		name = n;
	}
	
	public String toString() 
	{
		if (protein<2)
			return name + " has " + calories + " calories and " + protein + " gram of protein";
		else
			return name + " has " + calories + " calories and " + protein + " grams of protein";
	}
}