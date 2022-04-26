/*

Program: MTutor.java          Date: Apr 21


Author: Charlie Houston
School: CHHS
Course: Computer Science 10
 

*/

package Assingments;

import java.util.Scanner;//import scanner

public class MTutor 
{

	public static void main(String[] args) 
	{
		Scanner userinput = new Scanner(System.in);//create scanner
	
		
		int randomnum1 = 1 + (int) (Math.random() * 10);//creating random numbers
	
		int randomnum2 = 1 + (int) (Math.random() * 10);
	
		System.out.println("Select an operator by typing the associated number: ");//prompt for operator
	
		System.out.println("1 : Addition");//output options 
		System.out.println("2 : Subtraction");
		System.out.println("3 : Division");
		System.out.println("4 : Multiplication");
	
		int operator = userinput.nextInt();//record operator
	
		switch (operator)//creating switch statement
		{
		case 1://Addition 
			int Canswer = randomnum1 + randomnum2;//create correct answer
			System.out.println("What is " + randomnum1 + "+" + randomnum2 + "?");//prompt for answer
			int answer = userinput.nextInt();//record answer
			if (answer == Canswer)//checking answer, create if statement 
			{
				System.out.println("You got it right! Congradulations!!");//output message 
			}
			else//creating else statement if wrong
			{
				System.out.println("you were incorrect. You'll get it next time!");//output message
			}
			break;//break case
	
		case 2://Subtraction
			int Canswer2 = randomnum1 - randomnum2;//create correct answer
			System.out.println("What is " + randomnum1 + "-" + randomnum2 + "?");//prompt for answer
			int answer2 = userinput.nextInt();//record answer
			if (answer2 == Canswer2)//checking answer, create if statement
			{
				System.out.println("You got it right! Congradulations!!");//output message 
			}
			else//creating else statement if wrong
			{
				System.out.println("you were incorrect. You'll get it next time!");//output message 
			}
			break;//break case
	
		case 3://Division
			int Canswer3 = randomnum1/randomnum2;//create correct answer
			System.out.println("What is " + randomnum1 + "/" + randomnum2 + "?");//prompt for answer
			int answer3 = userinput.nextInt();//record answer
			if (answer3 == Canswer3)//checking answer, create if statement
			{
				System.out.println("You got it right! Congradulations!!");//output message 
			}
			else//creating else statement if wrong
			{
				System.out.println("you were incorrect. You'll get it next time!");//output message 
			}
			break;//break case
	
		case 4://Multiplication
			int Canswer4 = randomnum1*randomnum2;//create correct answer
			System.out.println("What is " + randomnum1 + "*" + randomnum2 + "?");//prompt for answer
			int answer4 = userinput.nextInt();//record answer
			if (answer4 == Canswer4)//checking answer, create if statement
			{
				System.out.println("You got it right! Congratulations!!");//output message 
			}
			else//creating else statement if wrong
			{
				System.out.println("You were incorrect. You'll get it next time!");//output message 
			}
			break;//break case
		}//end switch statement
	
	}

}
/* Screen Dump
Select an operator by typing the associated number: 
1 : Addition
2 : Subtraction
3 : Division
4 : Multiplication
4
What is 4*5?
20
You got it right! Congratulations!!
*/