/*

Program: ChangeApplication.java          Date: Apr 6 2022


Author: Charlie Houston 
School: CHHS
Course: Computer Science 10
 

*/

package Assingments;

import java.util.Scanner;//import scanner

public class ChangeApplication 
{

	public static void main(String[] args) 
	{
		Scanner userinput = new Scanner(System.in);//create scanner
	
		System.out.println("Enter the ammount of change you have: ");//prompt change 
	
		int change = userinput.nextInt();//record change
	
		int quarters = change / 25;//pulling quarters variable
	
		int dimes = (change % 25)/10;//pulling dimes variable
	
		int nickels = ((change % 25)%10)/5;//pulling nickels variable
	
		System.out.println("The ammount of change you have is: " + change);//Output change
	
		System.out.println("Quarters: " + quarters);//output variables
	
		System.out.println("Dimes: " + dimes);
	
		System.out.println("Nickels: " + nickels);

	}

}
/* Screen Dump
Enter the ammount of change you have: 
219
The ammount of change you have is: 219
Quarters: 8
Dimes: 1
Nickels: 1	 
*/