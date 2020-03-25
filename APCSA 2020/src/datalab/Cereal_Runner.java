package datalab;

public class Cereal_Runner 
{
	public static void main(String[] args) 
	{
		String[] names = new String[] {"100% Bran", "100% Natural Bran", "All-Bran", "All-Bran with Extra Fiber", "Almond Delight",
				"Apple Cinnamon Cheerios", "Apple Jacks", "Basic 4", "Bran Chex", "Bran Flakes", "Cap'n'Crunch", "Cheerios",
				"Cinnamon Toast Crunch", "Clusters", "Cocoa Puffs", "Corn Chex", "Corn Flakes", "Corn Pops", "Count Chocola",
				"Cracklin' Oat Bran", "Cream of Wheat (Quick)"};
		int[] calories = new int[] {70, 120, 70, 50, 110, 110, 110, 130, 90, 90, 120, 110, 120, 110, 110, 110, 100, 110, 110, 110, 100};
		int[] protein = new int[] {4, 3, 4, 4, 2, 2, 2, 3, 2, 3, 1, 6, 1, 3, 1, 2, 2, 1, 1, 3, 3};
		Cereal[] cereals = new Cereal[names.length];
		for (int i = 0; i < names.length; i++) cereals[i] = new Cereal(names[i], calories[i], protein[i]);
		int max = 0;
		Cereal bestCereal = new Cereal();
		Cereal worstCereal = new Cereal();
		int score;
		int inversescore;
		for (Cereal c : cereals) 
		{
			score = c.score();
			if (score > max) 
			{
				max = score;
				bestCereal = c;
			}
		}
		for (Cereal c : cereals) 
		{
			inversescore = c.inversescore();
			if (inversescore < max) 
			{
				max = inversescore;
				worstCereal = c;
			}
		}
		System.out.println(bestCereal + ", and is the best cereal for a healthy, low-calorie/high-protein breakfast.");
		System.out.println(worstCereal + ", and is the best cereal for an unhealthy, high-calorie/low-protein breakfast.");
	}
}