/*

Program: HonRoll.java          Date: Apr 25


Author: Please enter your first and last name here 
School: CHHS
Course: Computer Science 10
 

*/

package Assingments;

import java.util.Scanner;//import scanner

public class HonRoll 
{

	public static void main(String[] args) 
	{
		Scanner usinp = new Scanner(System.in);//create scanner

		System.out.println("Please enter your GPA, or -1 to quit the program: ");//prompt for gpa
		
		double gpa = usinp.nextDouble();//record gpa
	
		while(gpa != -1)//create while loop if gpa does not equal -1
		{
	
		System.out.println("Your gpa is " + gpa);//output gpa
		
		if(gpa > 3.79)//creating if statement
		{
		System.out.println("summa cum laude");//output honors dist
		}
		else if(gpa > 3.64 && gpa < 3.8)//creating else if
		{
		System.out.println("magna cum laude");//output honors dist
		}
		else if(gpa < 3.65 && gpa > 3.49)//creating else if
		{
		System.out.println("cum laude");//output honors	dist
		}
		else//creating else
		{
		System.out.println("Sorry, at this gpa, you did not qualify for an honours distinction");//output honors dist		
		}
		System.out.println("To continue, enter another gpa. To quit, enter -1");//prompt for another gpa
		gpa = usinp.nextDouble();//record gpa
		}//loop if another gpa was entered
		
		System.out.println("Thank you for using our program, have a great day!");//output exit message
	
	}
	

}
/* Screen Dump
Please enter your GPA, or -1 to quit the program: 
3.0
Your gpa is 3.0
Sorry, at this gpa, you did not qualify for an honours distinction
To continue, enter another gpa. To quit, enter -1
-1
Thank you for using our program, have a great day!



 */