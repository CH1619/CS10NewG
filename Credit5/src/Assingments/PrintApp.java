/*

Program: PrintApp.java          Date: Apr 20


Author: Charlie Houston
School: CHHS
Course: Computer Science 10
 

*/
package Assingments;

import java.util.Scanner;

public class PrintApp 
{

	public static void main(String[] args) 
	{
	Scanner userinput = new Scanner(System.in);
	
	System.out.println("Enter the number of copies to be printed: ");
	
	int copies = userinput.nextInt();
	
	double price = 0;
	
	if (copies < 100)
	{
	price = 0.30;
	
	}
	else if (copies > 99 && copies < 500)
	{
	price = 0.28;	
	
	}
	else if (copies > 499 && copies < 750)
	{
	price = 0.27;	
	
	}
	else if (copies > 749 && copies < 1000)
	{
	price = 0.26;	
	
	}
	else if (copies > 1000)
	{
	price = 0.25;	
	
	}
	
	double cost = copies*price;
	
	System.out.println("Price per copy is: " + price);
	
	System.out.println("Total Cost is: " + cost);
	}

}
/* Screen Dump
Enter the number of copies to be printed: 
1001
Price per copy is: 0.25
Total Cost is: 250.25




 */