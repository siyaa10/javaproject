package Javaproject;

import java.util.Scanner;
class invalidAmountException extends Exception
{
	invalidAmountException(String str)
	{
		super(str);
	}
}
class Customer
{
	long AccountNumber;
	String AccountType;
	String CustomerName;
	int AccountBalance;
	Scanner sc=new Scanner(System.in);
	public void setCustomerDetails()
	{
		System.out.println("Enter the Account number");
		AccountNumber=sc.nextLong();
		System.out.println("Enter the Account type");
		AccountType=sc.next();
		System.out.println("Enter the customer name");
		CustomerName=sc.next();
		System.out.println("Enter the account opening balance");
		AccountBalance=sc.nextInt();
	}
	public void getCustomerDetails()
	{
		System.out.println("The customer details are are:");
		System.out.println("Account number:" +AccountNumber);
		System.out.println("Account type:"+AccountType);
		System.out.println("Customer name:"+CustomerName);
		System.out.println("Account balance:"+AccountBalance);
	}
	public void searchAccountNumber()
	{
		
	}
}
public class BankCustomer
{
	public static void main(String[]args)
	{
		invalidAmountException amountException= new invalidAmountException("Invalid amount exception");
		int choice;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of customers");
		int NumberOfCustomers=sc.nextInt();
		Customer[] customer=new Customer[5];
		for(int i=0;i<NumberOfCustomers;i++)
		{
			customer[i]=new Customer();
			customer[i].setCustomerDetails();
		}
		for(int i=0;i<NumberOfCustomers;i++)
		{
			customer[i].getCustomerDetails();
		}
		do
		{
			System.out.println("1.Display Account details");
			System.out.println("2.Search by Account number");
			System.out.println("3.Deposit the amount");
			System.out.println("4.Withdraw the amout");
			System.out.println("5.Exit");
			System.out.println("Enter your choice");
		    choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				for(int i=0;i<NumberOfCustomers;i++)
				{
					customer[i].getCustomerDetails();
				}
				break;
			case 2:
				System.out.println("Enter the account number");
				int searchAccount=sc.nextInt();
				for(int i=0;i<NumberOfCustomers;i++)
				{
					if(customer[i].AccountNumber==searchAccount)
					{
						customer[i].getCustomerDetails();
					}
				}
				break;
			case 3:
				System.out.println("Enter the account number");
			    searchAccount=sc.nextInt();
			    try
			    {
			    System.out.println("Enter the amount to deposit:");
			    int depositAmount=sc.nextInt();
			    if(depositAmount<0)
			    {
			    	throw amountException;
			    }
			    else
			    {
			    for(int i=0;i<NumberOfCustomers;i++)
				{
					if(customer[i].AccountNumber==searchAccount)
					{
						customer[i].AccountBalance=customer[i].AccountBalance+depositAmount;
						customer[i].getCustomerDetails();
					}
				}
			    }
			    }
			    catch(invalidAmountException e)
			    {
			    	System.out.println("e.getMessage");
			    }
				break;
			case 4:
				
			default:
			}
		}
		while(choice<5);
	}
}
