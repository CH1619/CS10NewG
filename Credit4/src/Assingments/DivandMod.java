/*

Program: DivandMod.java          Date: Apr 8


Author: Charlie Houston
School: CHHS
Course: Computer Science 10
 

*/
package Assingments;

import java.util.Scanner;//import scanner

public class DivandMod
{

	public static void main(String[] args) 
	{
		Scanner userinput= new Scanner(System.in);//create scanner
	
		System.out.println("Enter an integer: ");//prompt integer
	
		int int1 = userinput.nextInt();//record integer
	
		System.out.println("Enter a second integer: ");//prompt 2nd integer
	
		int int2 = userinput.nextInt();//record 2nd integer
	
		System.out.println(int1 + "/" + int2 + "=" + int1/int2);//recording the values and outputting the equations
		
		System.out.println(int1 + "%" + int2 + "=" + int1%int2 + "\n");
	
		System.out.println(int2 + "/" + int1 + "=" + int2/int1);
	
		System.out.println(int2 + "%" + int1 + "=" + int2%int1);
	}

}
/* Screen Dump
Enter an integer: 
2
Enter a second integer: 
14
2/14=0
2%14=2

14/2=7
14%2=0
	 


	 
*/