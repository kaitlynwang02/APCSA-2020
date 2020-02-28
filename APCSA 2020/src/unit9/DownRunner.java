package unit9;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.Arrays;
import java.util.ArrayList;

import unit8.RayDown;

public class DownRunner
{
	public static void main( String args[] )
	{	
		
		//int[] numArray = {-99, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12345};
		ArrayList<Integer> numArrayList = new ArrayList <Integer>(Arrays.asList(-99, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12345));
		System.out.println(ListDown.go(numArrayList));
		//int[] numArray1 = {10,9,8,7,6,5,4,3,2,1,-99};
		ArrayList<Integer> numArrayList1 = new ArrayList <Integer>(Arrays.asList(10,9,8,7,6,5,4,3,2,1,-99));
		System.out.println(ListDown.go(numArrayList1));
		//int[] numArray2 = {10,20,30,40,50,-11818,40,30,20,10};
		ArrayList<Integer> numArrayList2 = new ArrayList <Integer>(Arrays.asList(10,20,30,40,50,-11818,40,30,20,10));
		System.out.println(ListDown.go(numArrayList2));
		//int[] numArray3 = {32767};
		ArrayList<Integer> numArrayList3 = new ArrayList <Integer>(Arrays.asList(32767));
		System.out.println(ListDown.go(numArrayList3));
		//int[] numArray4 = {255, 255};
		ArrayList<Integer> numArrayList4 = new ArrayList <Integer>(Arrays.asList(255, 255));
		System.out.println(ListDown.go(numArrayList4));
		//int[] numArray5 = {9, 10, -88, 100, -555, 1000};
		ArrayList<Integer> numArrayList5 = new ArrayList <Integer>(Arrays.asList(9, 10, -88, 100, -555, 1000));
		System.out.println(ListDown.go(numArrayList5));
		//int[] numArray6 = {10, 10, 10, 11, 456};
		ArrayList<Integer> numArrayList6 = new ArrayList <Integer>(Arrays.asList(10, 10, 10, 11, 456));
		System.out.println(ListDown.go(numArrayList6));
		//int[] numArray7 = {-111, 1, 2, 3, 9, 11, 20, 30};
		ArrayList<Integer> numArrayList7 = new ArrayList <Integer>(Arrays.asList(-111, 1, 2, 3, 9, 11, 20, 30));
		System.out.println(ListDown.go(numArrayList7));
		//int[] numArray8 = {9, 8, 7, 6, 5, 4, 3, 2, 0, -2, -989};
		ArrayList<Integer> numArrayList8 = new ArrayList <Integer>(Arrays.asList(9, 8, 7, 6, 5, 4, 3, 2, 0, -2, -989));
		System.out.println(ListDown.go(numArrayList8));
		//int[] numArray9 = {12, 15, 18, 21, 23, 1000};
		ArrayList<Integer> numArrayList9 = new ArrayList <Integer>(Arrays.asList(12, 15, 18, 21, 23, 1000));
		System.out.println(ListDown.go(numArrayList9));
		//int[] numArray10 = {250, 19, 17, 15, 13, 11, 10, 9, 6, 3, 2, 1, -455};
		ArrayList<Integer> numArrayList10 = new ArrayList <Integer>(Arrays.asList(250, 19, 17, 15, 13, 11, 10, 9, 6, 3, 2, 1, -455));
		System.out.println(ListDown.go(numArrayList10));
		//int[] numArray11 = {9, 10, -8, 10000, -5000, 1000};
		ArrayList<Integer> numArrayList11 = new ArrayList <Integer>(Arrays.asList(9, 10, -8, 10000, -5000, 1000));
		System.out.println(ListDown.go(numArrayList11));
		
	}
}