/*

Program: PrintApp.java          Date: Apr 20


Author: Charlie Houston
School: CHHS
Course: Computer Science 10
 

*/
package Assingments;

import java.util.Scanner;//import scanner

public class PrintApp 
{

	public static void main(String[] args) 
	{
		Scanner userinput = new Scanner(System.in);//create scanner
	
		System.out.println("Enter the number of copies to be printed: ");//prompt for copies
	
		int copies = userinput.nextInt();//record copies
	
		double price = 0;//creating price variable
	
		if (copies < 100)//creating if statement 
		{
			price = 0.30;//assigning price
	
		}
		else if (copies > 99 && copies < 500)//creating else if statement 
		{
			price = 0.28;//assigning price	
	
		}
		else if (copies > 499 && copies < 750)//creating else if statement 
		{
			price = 0.27;//assigning price	
	
		}
		else if (copies > 749 && copies < 1000)//creating else if statement 
		{
			price = 0.26;//assigning price	
	
		}
		else //creating else statement 
		{
			price = 0.25;//assigning price	
	
		}
	
		double cost = copies*price;//calculate the total cost
	
		System.out.println("Price per copy is: " + price);//output copies
	
		System.out.println("Total Cost is: " + cost);//output cost
	}

}
/* Screen Dump
Enter the number of copies to be printed: 
1001
Price per copy is: 0.25
Total Cost is: 250.25




 */