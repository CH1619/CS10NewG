/*

Program: StagesApp.java          Date: Apr 20


Author: Charlie Houston
School: CHHS
Course: Computer Science 10
 

*/
package Assingments;

import java.util.Scanner;//import scanner

public class StagesApp 
{

	public static void main(String[] args) 
	{
		Scanner userinput = new Scanner(System.in);//create scanner
	
		System.out.println("Enter your age: ");//prompt for age
	
		int age = userinput.nextInt();//record age
	
		if (age > 18)//create if statement 
		{
			System.out.println("Hello, you are an adult");//output message
		}
		else if (age < 18 && age > 12)//create else if statement
		{
			System.out.println("Hello, you are a teen");//output message		
		}
		else if (age < 13 && age > 9)//create else if statement
		{
			System.out.println("Hello, you are a preteen");	//output message	
		}
		else if (age < 11 && age > 5)//create else if statement
		{
			System.out.println("Hello, you are a child");//output message		
		}
		else if (age < 6)//create else if statement
		{
			System.out.println("Hello, you are a toddler");	//output message	
		}
	
	}

}
/* Screen Dump
Enter your age: 
15
Hello, you are a teen

*/