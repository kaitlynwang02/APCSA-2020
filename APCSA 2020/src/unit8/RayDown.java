package unit8;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayDown
{
	/*private static int[] numArray;
	
	public RayDown(int[] array) {
		setArray(array);
	}
	public void setArray(int[] array) {
		numArray = array;
	}*/
	
	public static boolean go(int[] numArray)
	{
		//int[] numArray = {-99, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12345};
		
		int x = 0;
		
		for (int i = 0; i < numArray.length-1; i++) {
			if (numArray[i] > numArray[i+1])
				x++;
		}
		
		if (x == numArray.length-1)
			return true;
		
		else
		return false;
		
	}	
}