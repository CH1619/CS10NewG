/*

Program: DigitsApplication.java          Date: Apr 7


Author: Charlie Houston
School: CHHS
Course: Computer Science 10
 

*/
package Assingments;

import java.util.Scanner;

public class DigitsApplication 
{

	public static void main(String[] args) 
	{
	Scanner userinput = new Scanner(System.in);

	System.out.println("Enter a three digit number:");
	
	int number = userinput.nextInt();
	
	int hundreds = number/100;
	
	int tens = (number%100)/10;
	
	int ones = ((number%100)%10)/1;
	
	System.out.println("Your Number is: " + number + "\n\n");
	
	System.out.println("The hundreds place digit is: " + hundreds + "\n");
	
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