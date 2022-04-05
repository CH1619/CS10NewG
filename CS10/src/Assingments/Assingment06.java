/*

Program: Assingment06.java          Date: Apr 4


Author: Charlie Houston
School: CHHS
Course: Computer Science 10
 

*/
package Assingments;

import java.util.Scanner;  // Import the Scanner class


public class Assingment06 
{

	public static void main(String[] args) 
	{
	Scanner myObj = new Scanner(System.in);
	
	String firstName;
	String lastName;
	int grade;
	String school;
	String hobby;
	
	System.out.println("What is your first Name?"); 
	firstName = myObj.next();  
	System.out.println("What is your last name?");
	lastName = myObj.next();
	
	System.out.println("What grade are you in?");
	grade = myObj.nextInt();

	
	System.out.println("What school do you attend?");
	school = myObj.next();
	
	System.out.println("What is your favourite hobby?");
	hobby = myObj.next();
	
	System.out.println("Hello, your name is "+ firstName + " " + lastName + ", you are currently in grade " + grade + " at " + school + ". Your favourite hobby is " + hobby);
	
/* Screen Dump






*/
	}

}
