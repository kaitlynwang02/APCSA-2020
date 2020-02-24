package unit8;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	public static int go(int[] ray)
	{
		
		for (int i = 0; i < ray.length-1; i++) {
			if (ray[i] % 2 == 1) {
				for (int x = i; x < ray.length-1; x++) {
					if (ray[x] % 2 == 0)
						return x-i;
			}	
			
		}
			else if (ray[i] % 2 == 0)
				i++;
			
			else return -1;
	}
		
		return -1;
}
}