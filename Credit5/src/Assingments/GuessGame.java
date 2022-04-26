/*

Program: GuessGame.java          Date: Apr 22


Author: Please enter your first and last name here 
School: CHHS
Course: Computer Science 10
 

*/

package Assingments;

import java.util.Scanner;//import scanner

public class GuessGame 
{

	public static void main(String[] args)
	{
		Scanner userinput = new Scanner(System.in);//create scanner
		
		int randomnum = 1 + (int) (Math.random() * 20);//creating computer's random num

		System.out.println("Enter a number between 1 and 20: ");//prompt for guess
	
		int guess = userinput.nextInt();//record guess
	
		System.out.println("Computer's number is: " + randomnum);//output comp num
	
		System.out.println("Player's number is: " + guess);//output guess
	
		if (randomnum == guess)// creating statement if guess is right
		{
			System.out.println("You Won!");//output message	
		}
		else//create else statement
		{
			System.out.println("Better luck next time.");//output message
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