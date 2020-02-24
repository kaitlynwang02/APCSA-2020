package unit8;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class SumLastRunner
{
	public static void main( String args[] )
	{		
		int[] ray = {-99,1,2,3,4,5,6,7,8,9,10,5};
		System.out.println(RaySumLast.go(ray));
		
		int[] ray1 = {10,9,8,7,6,5,4,3,2,1,-99};
		System.out.println(RaySumLast.go(ray1));

		int[] ray2 = {10,20,30,40,50,-11818,40,30,20,10};
		System.out.println(RaySumLast.go(ray2));
		
		int[] ray3 = {32767};
		System.out.println(RaySumLast.go(ray3));
		
		int[] ray4 = {255, 255};
		System.out.println(RaySumLast.go(ray4));
		
		int[] ray5 = {9,10,-88,100,-555,2};
		System.out.println(RaySumLast.go(ray5));
		
		int[] ray6 = {10,10,10,11,456};
		System.out.println(RaySumLast.go(ray6));
		
		int[] ray7 = {-111,1,2,3,9,11,20,1};
		System.out.println(RaySumLast.go(ray7));
		
		int[] ray8 = {9,8,7,6,5,4,3,2,0,-2,6};
		System.out.println(RaySumLast.go(ray8));
		
		int[] ray9 = {12,15,18,21,23,1000};
		System.out.println(RaySumLast.go(ray9));
		
		int[] ray10 = {250,19,17,15,13,11,10,9,6,3,2,1,0};
		System.out.println(RaySumLast.go(ray10));
		
		int[] ray11 = {9,10,-8,10000,-5000,-3000};
		System.out.println(RaySumLast.go(ray11));
	}
}