package unit8;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;

public class DownRunner
{
	public static void main( String args[] )
	{	
		int[] numArray = {-99, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12345};
		System.out.println(RayDown.go(numArray));
		int[] numArray1 = {10,9,8,7,6,5,4,3,2,1,-99};
		System.out.println(RayDown.go(numArray1));
		int[] numArray2 = {10,20,30,40,50,-11818,40,30,20,10};
		System.out.println(RayDown.go(numArray2));
		int[] numArray3 = {32767};
		System.out.println(RayDown.go(numArray3));
		int[] numArray4 = {255, 255};
		System.out.println(RayDown.go(numArray4));
		int[] numArray5 = {9, 10, -88, 100, -555, 1000};
		System.out.println(RayDown.go(numArray5));
		int[] numArray6 = {10, 10, 10, 11, 456};
		System.out.println(RayDown.go(numArray6));
		int[] numArray7 = {-111, 1, 2, 3, 9, 11, 20, 30};
		System.out.println(RayDown.go(numArray7));
		int[] numArray8 = {9, 8, 7, 6, 5, 4, 3, 2, 0, -2, -989};
		System.out.println(RayDown.go(numArray8));
		int[] numArray9 = {12, 15, 18, 21, 23, 1000};
		System.out.println(RayDown.go(numArray9));
		int[] numArray10 = {250, 19, 17, 15, 13, 11, 10, 9, 6, 3, 2, 1, -455};
		System.out.println(RayDown.go(numArray10));
		int[] numArray11 = {9, 10, -8, 10000, -5000, 1000};
		System.out.println(RayDown.go(numArray11));
		
		
	}
}