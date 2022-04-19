/*

Program: Assingment11.java          Date: Apr 13


Author: Charlie Houston
School: CHHS
Course: Computer Science 10
 

*/

package Assingments;

import java.util.Scanner;

public class Assingment11 
{

	public static void main(String[] args) 
	{
	Scanner userinput = new Scanner(System.in);

	System.out.println("Please enter any three digits: ");
	
	int numbers = userinput.nextInt();
	
	int firstDig = numbers / 100;
	
	int secondDig = (numbers%100)/10;
	
	int thirdDig = ((numbers%100)%10)/1;
	
	int max = 0;
	
	int min = 0;
	
	int sum = secondDig + firstDig + thirdDig;
	
	int pro = secondDig * firstDig * thirdDig;
	
	int avr = (secondDig + firstDig + thirdDig)/3;
	
	//579
	
	if (secondDig > firstDig && thirdDig > secondDig && firstDig < thirdDig)
	{
	max = thirdDig;
	
	min = firstDig;
	}
	//931
	else if (firstDig > secondDig && thirdDig < secondDig && firstDig > thirdDig)
	{
	max = firstDig;
			
	min = thirdDig;
	}
	//486
	else if (secondDig > firstDig && thirdDig > firstDig && thirdDig < secondDig)
	{
	max = secondDig;
			
	min = firstDig;
	}
	//452
	else if (firstDig < secondDig && thirdDig < firstDig && secondDig > thirdDig)
	{
	max = secondDig;
	
	min = thirdDig;
	}
	//536	
	else if (firstDig > secondDig && secondDig < thirdDig && thirdDig > firstDig)
	{
	max = thirdDig;
	
	min = secondDig;
	}
		
	System.out.println("The largest of the three digits is: " + max);
	
	System.out.println("The smallest of the three digits is: " + min);
	
	System.out.println("The sum of the three digits is: " + sum);
	
	System.out.println("The product of the three digits is: " + pro);
	
	System.out.println("The average of the three digits is: " + avr);
	
	}

}
/* Screen Dump
Please enter any three digits: 
459
The largest of the three digits is: 9
The smallest of the three digits is: 4
The sum of the three digits is: 18
The product of the three digits is: 180
The average of the three digits is: 6

 
 
*/
