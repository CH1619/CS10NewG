/*

Program: DivandMod.java          Date: Apr 8


Author: Charlie Houston
School: CHHS
Course: Computer Science 10
 

*/
package Assingments;

import java.util.Scanner;

public class DivandMod
{

	public static void main(String[] args) 
	{
	Scanner userinput= new Scanner(System.in);
	
	System.out.println("Enter an integer: ");
	
	int int1 = userinput.nextInt();
	
	System.out.println("Enter a second integer: ");
	
	int int2 = userinput.nextInt();
	
	System.out.println(int1 + "/" + int2 + "=" + int1/int2);
	
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