/*

Program: ChangeApplication.java          Date: Apr 6 2022


Author: Charlie Houston 
School: CHHS
Course: Computer Science 10
 

*/

package Assingments;

import java.util.Scanner;

public class ChangeApplication 
{

	public static void main(String[] args) 
	{
	Scanner userinput = new Scanner(System.in);
	
	System.out.println("Enter the ammount of change you have: ");
	
	int change = userinput.nextInt();
	
	int quarters = change / 25;
	
	int dimes = (change % 25)/10;
	
	int nickels = ((change % 25)%10)/5;
	
	System.out.println("The ammount of change you have is: " + change);
	
	System.out.println("Quarters: " + quarters);
	
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