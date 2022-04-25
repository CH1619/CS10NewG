package Assingments;

import java.util.Scanner;

public class HonRoll 
{

	public static void main(String[] args) 
	{
		Scanner usinp = new Scanner(System.in);

		System.out.println("Please enter your GPA, or -1 to quit the program: ");
		
		double gpa = usinp.nextDouble();
	
		while(gpa != -1)
		{
	
		System.out.println("Your gpa is " + gpa);
		if(gpa > 3.79)
		{
		System.out.println("summa cum laude");	
		}
		else if(gpa > 3.64 && gpa < 3.8)
		{
		System.out.println("magna cum laude");
		}
		else if(gpa < 3.65 && gpa > 3.49)
		{
		System.out.println("cum laude");	
		}
		else
		{
		System.out.println("Sorry, at this gpa, you did not qualify for an honours distinction");		
		}
		System.out.println("To continue, enter another gpa. To quit, enter -1");
		gpa = usinp.nextDouble();
		}
		
		System.out.println("Thank you for using our program, have a great day!");
	
	}
	

}
