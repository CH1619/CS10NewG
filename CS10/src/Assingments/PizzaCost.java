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
	Double LaborCost= 0.75;
	Double RentCost= 1.00;
	Double Materials= 0.05;
	Scanner myObj = new Scanner(System.in);
	String diameter;
    
    // Enter Diameter and press Enter
    System.out.println("Enter the diameter of the pizza in inches:");
    diameter = myObj.nextLine();   
	
	System.out.print("The Cost of making the pizza is:  "  );
	System.out.print(LaborCost+RentCost);
	}
	
	
/* Screen Dump
	 


	 
*/
}
