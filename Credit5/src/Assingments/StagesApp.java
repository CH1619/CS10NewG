/*

Program: StagesApp.java          Date: Apr 20


Author: Charlie Houston
School: CHHS
Course: Computer Science 10
 

*/
package Assingments;

import java.util.Scanner;

public class StagesApp 
{

	public static void main(String[] args) 
	{
	Scanner userinput = new Scanner(System.in);
	
	System.out.println("Enter your age: ");
	
	int age = userinput.nextInt();
	
	if (age > 18)
	{
	System.out.println("Hello, you are an adult");	
	}
	else if (age < 18 && age > 12)
	{
	System.out.println("Hello, you are a teen");		
	}
	else if (age < 13 && age > 9)
	{
	System.out.println("Hello, you are a preteen");		
	}
	else if (age < 11 && age > 5)
	{
	System.out.println("Hello, you are a child");		
	}
	else if (age < 6)
	{
	System.out.println("Hello, you are a toddler");		
	}
	
	}

}
/* Screen Dump
Enter your age: 
15
Hello, you are a teen

*/