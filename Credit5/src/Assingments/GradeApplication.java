/*

Program: GradeApplication.java          Date: Apr 20


Author: Charlie Houston
School: CHHS
Course: Computer Science 10
 

*/
package Assingments;

import java.util.Scanner;//import scanner

public class GradeApplication 
{

	public static void main(String[] args) 
	{
		Scanner userinput = new Scanner(System.in);//create scanner
	
		System.out.println("Enter a grade percentage: ");//prompt grade
	
		int grade = userinput.nextInt();//record grade
	
		if  (grade > 89 )//create if statement
		{
			System.out.println("The corresponding letter grade is A+");//output grade
	
		}
		else if (grade > 79 && grade < 90)//create if statement
		{
			System.out.println("The corresponding letter grade is A");//output grade
	
		}
		else if (grade > 74 && grade < 80)//create else if statement
		{
			System.out.println("The corresponding letter grade is B+");//output grade
	
		}
		else if (grade > 69 && grade < 75)//create else if statement
		{
			System.out.println("The corresponding letter grade is B");//output grade
	
		}
		else if (grade > 64 && grade < 70)//create else if statement
		{
			System.out.println("The corresponding letter grade is C+");//output grade
	
		}
		else if (grade > 59 && grade < 65)//create else if statement
		{
			System.out.println("The corresponding letter grade is C");//output grade
	
		}
		else if (grade > 54 && grade < 60)//create else if statement
		{
			System.out.println("The corresponding letter grade is D+");//output grade
	
		}
		else if (grade > 49 && grade < 55)//create else if statement
		{
			System.out.println("The corresponding letter grade is D");//output grade
	
		}
		else if (grade < 50)//create else if statement
		{
			System.out.println("The corresponding letter grade is F");//output grade
	
	}

	}

}
/* Screen Dump
Enter a grade percentage: 
75
The corresponding letter grade is B+
*/