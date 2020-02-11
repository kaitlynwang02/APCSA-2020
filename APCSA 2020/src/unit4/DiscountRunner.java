package unit4;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class DiscountRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		out.println("Enter the original bill amount :: 500");
		out.print("Bill after discount :: ");
		out.printf("%.2f\n", Discount.getDiscountedBill(500));
		out.println("");
		
		out.println("Enter the original bill amount :: 2500");
		out.print("Bill after discount :: ");
		out.printf("%.2f\n", Discount.getDiscountedBill(2500));
		out.println("");
		
		out.println("Enter the original bill amount :: 4000");
		out.print("Bill after discount :: ");
		out.printf("%.2f\n", Discount.getDiscountedBill(4000));
		out.println("");
		
		out.println("Enter the original bill amount :: 333.33");
		out.print("Bill after discount :: ");
		out.printf("%.2f\n", Discount.getDiscountedBill(333.33));
		out.println("");
		
		out.println("Enter the original bill amount :: 95874.2154");
		out.print("Bill after discount :: ");
		out.printf("%.2f\n", Discount.getDiscountedBill(95874.2154));
		out.println("");

	}
}