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
		Scanner myObj = new Scanner(System.in);//creating scanner
	
		String firstName;//assigning variables
		String lastName;
		int grade;
		String school;
		String hobby;
	
		System.out.println("What is your first Name?");//prompt first name
		firstName = myObj.next();//record first name  

		System.out.println("What is your last name?");//prompt last
		lastName = myObj.next();//record last
	
		System.out.println("What grade are you in?");//prompt grade
		grade = myObj.nextInt();//record grade

	
		System.out.println("What school do you attend?");//prompt school
		school = myObj.next();//record school
	
		System.out.println("What is your favourite hobby?");//prompt hobby
		hobby = myObj.next();//record hobby
	
		System.out.println("Hello, your name is "+ firstName + " " + lastName + 
		", you are currently in grade " + grade + " at " + school + ". Your favourite hobby is " + hobby);//pulling variables and display message
	

	}

}
/* Screen Dump

What is your first Name?
Charlie
What is your last name?
Houston
What grade are you in?
10
What school do you attend?
CHHS
What is your favourite hobby?
Skiing
Hello, your name is Charlie Houston, you are currently in grade 10 at CHHS. Your favourite hobby is Skiing

*/