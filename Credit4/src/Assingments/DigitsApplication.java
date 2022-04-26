/*

Program: DigitsApplication.java          Date: Apr 7


Author: Charlie Houston
School: CHHS
Course: Computer Science 10
 

*/
package Assingments;

import java.util.Scanner;//import scanner

public class DigitsApplication 
{

	public static void main(String[] args) 
	{
		Scanner userinput = new Scanner(System.in);//create scanner

		System.out.println("Enter a three digit number:");//prompt for number
	
		int number = userinput.nextInt();//record the number
	
		int hundreds = number/100;//pulling hundreds digit
	
		int tens = (number%100)/10;//pulling tens digit
		
		int ones = ((number%100)%10)/1;//pulling ones digit
	
		System.out.println("Your Number is: " + number + "\n\n");//output number
	
		System.out.println("The hundreds place digit is: " + hundreds + "\n");//output variables
	
		System.out.println("The tens place digit is: " + tens +"\n");
	
		System.out.println("The ones place digit is: " + ones);

	}

}
/* Screen Dump
Enter a three digit number:
385
Your Number is: 385


The hundreds place digit is: 3

The tens place digit is: 8

The ones place digit is: 5
*/