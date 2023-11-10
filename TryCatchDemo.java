package Javaproject;
import java.util.Scanner;
public class TryCatchDemo {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int number1,number2;
		char choice='Y';
		int result;
		while(choice=='Y')
		{
		System.out.println("enter first number");
		number1=sc.nextInt();
		System.out.println("enter the second number");
		number2=sc.nextInt();
	
		try
		{
			result=number1/number2;
			System.out.println("Result :"+result);
		}
	catch(Exception e)
	{
		System.out.println("/ by zero");
	}
	finally
	{
		System.out.println("End of operation");
		System.out.println("Do you want to continue");
		choice=sc.next().charAt(0);
	}

}
}
}

