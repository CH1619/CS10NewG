package Assingments;

import java.util.Scanner;

public class MTutor 
{

	public static void main(String[] args) 
	{
	Scanner userinput = new Scanner(System.in);
	
	Scanner Qanswer = new Scanner(System.in);
	
	int randomnum1 = 1 + (int) (Math.random() * 10);
	
	int randomnum2 = 1 + (int) (Math.random() * 10);
	
	System.out.println("Select an operator by typing the associated number: ");
	
	System.out.println("1 : Addtion");
	System.out.println("2 : Subtraction");
	System.out.println("3 : Division");
	System.out.println("4 : Multiplication");
	
	int operator = userinput.nextInt();
	
	switch (operator)
	{
	case 1: 
	int Canswer = randomnum1 + randomnum2;
	System.out.println("What is " + randomnum1 + "+" + randomnum2 + "?");
	int answer = Qanswer.nextInt();
	if (answer == Canswer)
	{
	System.out.println("You got it right! Congradulations!!");
	}
	else
	{
	System.out.println("you were incorrect. You'll get it next time!");
	}
	break;
	
	case 2:
	int Canswer2 = randomnum1 - randomnum2;
	System.out.println("What is " + randomnum1 + "-" + randomnum2 + "?");
	int answer2 = Qanswer.nextInt();
	if (answer2 == Canswer2)
	{
	System.out.println("You got it right! Congradulations!!");
	}
	else
	{
	System.out.println("you were incorrect. You'll get it next time!");
	}
	break;
	
	case 3:
	int Canswer3 = randomnum1/randomnum2;
	System.out.println("What is " + randomnum1 + "/" + randomnum2 + "?");
	int answer3 = Qanswer.nextInt();
	if (answer3 == Canswer3)
	{
	System.out.println("You got it right! Congradulations!!");
	}
	else
	{
	System.out.println("you were incorrect. You'll get it next time!");
	}
	break;
	
	case 4:
	int Canswer4 = randomnum1*randomnum2;
	System.out.println("What is " + randomnum1 + "*" + randomnum2 + "?");
	int answer4 = Qanswer.nextInt();
	if (answer4 == Canswer4)
	{
	System.out.println("You got it right! Congradulations!!");
	}
	else
	{
	System.out.println("You were incorrect. You'll get it next time!");
	}
	break;
	}
	
	
	
	
	
	}

}
