/*

Program: GradeApplication.java          Date: Apr 20


Author: Charlie Houston
School: CHHS
Course: Computer Science 10
 

*/
package Assingments;

import java.util.Scanner;

public class GradeApplication 
{

	public static void main(String[] args) 
	{
	Scanner userinput = new Scanner(System.in);
	
	System.out.println("Enter a grade percentage: ");
	
	int grade = userinput.nextInt();
	
	if  (grade > 89 )
	{
	System.out.println("The corresponding letter grade is A+");
	
	}
	else if (grade > 79 && grade < 90)
	{
	System.out.println("The corresponding letter grade is A");
	
	}
	else if (grade > 74 && grade < 80)
	{
	System.out.println("The corresponding letter grade is B+");
	
	}
	else if (grade > 69 && grade < 75)
	{
	System.out.println("The corresponding letter grade is B");
	
	}
	else if (grade > 64 && grade < 70)
	{
	System.out.println("The corresponding letter grade is C+");
	
	}
	else if (grade > 59 && grade < 65)
	{
	System.out.println("The corresponding letter grade is C");
	
	}
	else if (grade > 54 && grade < 60)
	{
	System.out.println("The corresponding letter grade is D+");
	
	}
	else if (grade > 49 && grade < 55)
	{
	System.out.println("The corresponding letter grade is D");
	
	}
	else if (grade < 50)
	{
	System.out.println("The corresponding letter grade is F");
	
	}

	}

}
/* Screen Dump
Enter a grade percentage: 
75
The corresponding letter grade is B+
*/