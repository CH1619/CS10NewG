/*

Program: EvenorOdd.java          Date: Apr 12


Author: Charlie Houston 
School: CHHS
Course: Computer Science 10
 

*/
package Assingments;

import java.util.Scanner;

public class EvenorOdd 
{

	public static void main(String[] args) 
	{
	Scanner userinput = new Scanner(System.in);
	
	System.out.println("Enter an integer: ");
	
	int int1 = userinput.nextInt();
	
	if (int1%2 == 0) {
	System.out.println("The integer " + int1 + " is even\n");
	}else {
	System.out.println("The integer " + int1 + " is odd\n");
	}
	System.out.println("Enter an integer: ");
	
	int int2 = userinput.nextInt();
    
	if (int2%2 ==0) {
	System.out.println("The integer " + int2 + " is even\n" );
	}else {
	System.out.println("The integer " + int2 + " is odd\n" );
	}
	System.out.println("Enter an integer: ");
	
	int int3 = userinput.nextInt();
	
	if (int3%2 == 0) {
	System.out.println("The integer " + int1 + " is even\n");
	}else {
	System.out.println("The integer " + int1 + " is odd\n");
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