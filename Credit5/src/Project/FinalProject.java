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
		
		double price = 0.00;//creating price
		
		while(size != -1)//creating while loop is size is chosen
		{
		
		if (size == 1)//create if statement
		{
			price = 3.00;//assign price

		}
		else if (size == 2)//create else if statement
		{
			price = 5.00;//assign price
		}
		else//else statement
		{
			price = 7.00;//assign price
		}
		
		System.out.println("Your price is: " + price + "0$");//display initial price
		
		System.out.println("Would you like to add butter for $1?");//prompt for butter
		
		System.out.println("1: no butter 2: add butter");//display choice
		
		int butter = userinput.nextInt();//record answer
		
		if (butter == 2)//create if statement for yes
		{
		Double Nprice = price + 1.00;//calculating new price
		
		System.out.println("Your price is: " + Nprice + "0$");//display new price
		}
		
		
		System.out.println("Please enter another size or -1 to quit");//prompt for new size
		
		size = userinput.nextInt();//record size
		}//loop   
		
		System.out.println("Transaction complete, enjoy your movie!");//display exit message
		
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