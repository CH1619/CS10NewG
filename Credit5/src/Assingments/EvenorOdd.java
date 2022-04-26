/*

Program: EvenorOdd.java          Date: Apr 12


Author: Charlie Houston 
School: CHHS
Course: Computer Science 10
 

*/
package Assingments;

import java.util.Scanner;//import scanner

public class EvenorOdd 
{

	public static void main(String[] args) 
	{
		Scanner userinput = new Scanner(System.in);//create scanner
	
		System.out.println("Enter an integer: ");//prompt integer
	
		int int1 = userinput.nextInt();//record integer
	
		if (int1%2 == 0)//create if statement 
		{
			System.out.println("The integer " + int1 + " is even\n");//outputting even
		}
		else//create else statement
		{
			System.out.println("The integer " + int1 + " is odd\n");//outputting odd
		}
		
		System.out.println("Enter an integer: ");//prompt integer 2
	
		int int2 = userinput.nextInt();//record integer 2
    
		if (int2%2 ==0)//create if statement  
		{
			System.out.println("The integer " + int2 + " is even\n" );//outputting even
		}
		else//create else statement 
		{
			System.out.println("The integer " + int2 + " is odd\n" );//outputting odd
		}
		
		System.out.println("Enter an integer: ");
	
		int int3 = userinput.nextInt();
	
		if (int3%2 == 0)//create if statement  
		{
			System.out.println("The integer " + int1 + " is even\n");//outputting even
		}
		else//create else statement 
		{
			System.out.println("The integer " + int1 + " is odd\n");//outputting odd
		}
		}
}
/* Screen Dump
Enter an integer: 
1
The integer 1 is odd

Enter an integer: 
2
The integer 2 is even

Enter an integer: 
3
The integer 1 is odd





 */