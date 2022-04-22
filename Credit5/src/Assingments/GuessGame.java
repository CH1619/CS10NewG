/*

Program: GuessGame.java          Date: Apr 22


Author: Please enter your first and last name here 
School: CHHS
Course: Computer Science 10
 

*/

package Assingments;

import java.util.Scanner;

public class GuessGame 
{

	public static void main(String[] args)
	{
	Scanner userinput = new Scanner(System.in);
		
	int randomnum = 1 + (int) (Math.random() * 20);

	System.out.println("Enter a number between 1 and 20: ");
	
	int guess = userinput.nextInt();
	
	System.out.println("Computer's number is: " + randomnum);
	
	System.out.println("Player's number is: " + guess);
	
	if (randomnum == guess)
	{
	System.out.println("You Won!");	
	}
	else
	{
	System.out.println("Better luck next time.");	
	}
	}

}
/* Screen Dump
Enter a number between 1 and 20: 
11
Computer's number is: 13
Player's number is: 11
Better luck next time.
*/