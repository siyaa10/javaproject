package javaproject;
import java.util.Scanner;
public class positiveornegative {
	public static void main(String[]args)
	{
		int number;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		number=sc.nextInt();
		if(number>0)
		{
			System.out.println("the number is positive");

		}
		else
		{
			System.out.println("the number is negative");
		}
	}

}
