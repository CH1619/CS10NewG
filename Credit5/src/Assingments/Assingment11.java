/*

Program: Assingment11.java          Date: Apr 13


Author: Charlie Houston
School: CHHS
Course: Computer Science 10
 

*/

package Assingments;

import java.util.Scanner;//import scanner 

public class Assingment11 
{

	public static void main(String[] args) 
	{
		Scanner userinput = new Scanner(System.in);//create scanner

		System.out.println("Please enter any three digits: ");//prompt for digits
		
		int numbers = userinput.nextInt();//record numbers
	
		int firstDig = numbers / 100;//pulling first dig
	
		int secondDig = (numbers%100)/10;//pulling second dig
	
		int thirdDig = ((numbers%100)%10)/1;//pulling third dig
	
		int max = 0;//creating max and min
	
		int min = 0;
	
		int sum = secondDig + firstDig + thirdDig;//record sum
	
		int pro = secondDig * firstDig * thirdDig;//record product
	
		int avr = (secondDig + firstDig + thirdDig)/3;//record average
	
		//579
	
		if (secondDig > firstDig && thirdDig > secondDig && firstDig < thirdDig)//creating if statement for Con 1
		{
			max = thirdDig;//assigning variables
			min = firstDig;
		}
		//931
		else if (firstDig > secondDig && thirdDig < secondDig && firstDig > thirdDig)//creating else if statement for Con 2
		{
			max = firstDig;//assigning variables
			min = thirdDig;
		}
		//486
		else if (secondDig > firstDig && thirdDig > firstDig && thirdDig < secondDig)//creating else if statement for Con 3
		{
			max = secondDig;//assigning variables
			min = firstDig;
		}
		//452
		else if (firstDig < secondDig && thirdDig < firstDig && secondDig > thirdDig)//creating else if statement for Con 4
		{
			max = secondDig;//assigning variables	
			min = thirdDig;
		}
		//536	
		else if (firstDig > secondDig && secondDig < thirdDig && thirdDig > firstDig)//creating else if statement for Con 5
		{
			max = thirdDig;//assigning variables
			min = secondDig;
	}
		
	System.out.println("The largest of the three digits is: " + max);//outputting all the collected data
	
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
