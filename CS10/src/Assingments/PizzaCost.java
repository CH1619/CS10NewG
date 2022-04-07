package Assingments;

/*

Program: PizzaCost.java          Date: Mar 30


Author: Charlie Houston
School: CHHS
Course: Computer Science 10
 

*/
import java.util.Scanner; // import the Scanner class 

public class PizzaCost 
{

	public static void main(String[] args) 
	{
		
		
	double diameter;	
	double LaborCost= 0.75;
	double RentCost= 1.00;
	double Materials= 0.05;
	try (Scanner myObj = new Scanner(System.in)) 
	{
		
		// Enter Diameter and press Enter
		System.out.println("Enter the diameter of the pizza in inches:");
		diameter = myObj.nextDouble();
	}
	System.out.print("The cost of making the pizza is:  "  );
	System.out.print(diameter*diameter*Materials+LaborCost+RentCost);

	}
	
	

}
/* Screen Dump
Enter the diameter of the pizza in inches:
user input=10
The cost of making the pizza is: 6.75
*/