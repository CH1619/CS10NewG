/*

Program: PizzaCost.java          Date: Mar 30


Author: Charlie Houston
School: CHHS
Course: Computer Science 10
 

*/
package Assingments;


import java.util.Scanner; // import the Scanner class 

public class PizzaCost 
{

	public static void main(String[] args) 
	{
		
		
		double diameter;//creating the variables	
		double LaborCost= 0.75;//Assigning all the costs
		double RentCost= 1.00;
		double Materials= 0.05;
		try (Scanner myObj = new Scanner(System.in))//adding a scanner
		{
			// Enter Diameter and press Enter
			System.out.println("Enter the diameter of the pizza in inches:");//prompt for diameter
			diameter = myObj.nextDouble();//pulling the user input
		}
		System.out.print("The cost of making the pizza is:  "  );// output the price
		System.out.print(diameter*diameter*Materials+LaborCost+RentCost);//calculating the price

	}
	
	

}
/* Screen Dump
Enter the diameter of the pizza in inches:
user input=10
The cost of making the pizza is: 6.75
*/