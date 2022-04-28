/*

Program: FinalProject.java          Date: Apr 27


Author: Charlie Houston
School: CHHS
Course: Computer Science 10
 

*/
package Project;

import java.util.Scanner;//import scanner

public class FinalProject 
{

	public static void main(String[] args) 
	{
		Scanner userinput = new Scanner(System.in);//create scanner

		
		System.out.println("Welcome to Cineplex! Please enter your popcorn size: ");
		
		System.out.println("Small: 1 Regular: 2 Large : 3 No popcorn: -1");//print options
		
		int size = userinput.nextInt();//record size
		
		double price = 0.00;
		
		while(size != -1)
		{
		
		if (size == 1)
		{
			price = 3.00;

		}
		else if (size == 2)
		{
			price = 5.00;
		}
		else 
		{
			price = 7.00;
		}
		
		System.out.println("Your price is: " + price + "0$");
		
		System.out.println("Would you like to add butter for $1?");
		
		System.out.println("1: no butter 2: add butter");
		
		int butter = userinput.nextInt();
		
		if (butter == 2)
		{
		Double Nprice = price + 1.00;
		
		System.out.println("Your price is: " + Nprice + "0$");
		
		}
		
		
		System.out.println("Please enter another size or -1 to quit");
		
		size = userinput.nextInt();
		} 
		System.out.println("Transaction complete, enjoy your movie!");
		
	}

}
/* Screen Dump
Welcome to Cineplex! Please enter your popcorn size: 
Small: 1 Regular: 2 Large : 3 No popcorn: -1
2
Your price is: 5.0$
Would you like to add butter for $1?
1: no butter 2: add butter
1
Please enter another size or -1 to quit
-1
Transaction complete, enjoy your movie!

*/