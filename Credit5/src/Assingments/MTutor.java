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
		
		double answer = 0;
		
		double Canswer = 0;
		switch (operator)//creating switch statement
		{
			case 1://Addition 
				Canswer = randomnum1 + randomnum2;//create correct answer
				System.out.println("What is " + randomnum1 + "+" + randomnum2 + "?");//prompt for answer
				answer = userinput.nextInt();//record answer
			
				break;//break case
	
			case 2://Subtraction
				Canswer = randomnum1 - randomnum2;//create correct answer
				System.out.println("What is " + randomnum1 + "-" + randomnum2 + "?");//prompt for answer
				answer = userinput.nextInt();//record answer
			
				break;//break case
	
			case 3://Division
				Canswer = randomnum1/randomnum2;//create correct answer
				System.out.println("What is " + randomnum1 + "/" + randomnum2 + "?");//prompt for answer
				answer = userinput.nextInt();//record answer
			
				break;//break case
	
			case 4://Multiplication
				Canswer = randomnum1*randomnum2;//create correct answer
				System.out.println("What is " + randomnum1 + "*" + randomnum2 + "?");//prompt for answer
				answer = userinput.nextInt();//record answer
			
				 break;//break case
		}//end switch statement
		
		if (answer == Canswer)//checking answer, create if statement 
		{
			System.out.println("You got it right! Congradulations!!");//output message 
		}
		else//creating else statement if wrong
		{
			System.out.println("you were incorrect. You'll get it next time!");//output message
		}

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