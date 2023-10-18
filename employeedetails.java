/*
 * file:employee details
 * description:to display the details of employee
 * author:Siya
 * version:1.0
 * date:17/10/2023
 */
package employeeDetails;
import java.util.Scanner;
public class employeedetails {
	public static void main(String[]args)
	{
		Officer officer=new Officer();
		System.out.println("enter the details of the officer");
		officer.getDetails();
		officer.setSpecialization();
	    System.out.println("officer details");
		officer.printDetails();
		officer.printSpecialization();
		Manager manager=new Manager();
		System.out.println("enter the details of the manager");
		manager.getDetails();
		manager.setDepartment();
		System.out.println("manager details");
		manager.printDetails();
		manager.printDepartment();
		
		
	}

}
class Employee
{
	String name;
	int age,salary;
	long phonenumber;
	String address;
	Scanner sc=new Scanner(System.in);
	public void getDetails()
	{
		System.out.println("enter name");
		sc.nextLine();
		name=sc.nextLine();
		System.out.println("enter age");
		age=sc.nextInt();
		System.out.println("enter phonenumber");
		phonenumber=sc.nextLong();
		System.out.println("enter salary");
		salary=sc.nextInt();
		System.out.println("enter address");
		sc.nextLine();
		address=sc.nextLine();
		
	}
	public void printDetails()
	{
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		System.out.println("phonenumber:"+phonenumber);
		System.out.println("salary:"+salary);
		System.out.println("address:"+address);

	}
	
}
class Officer extends Employee
{
	String specialization;
	public void setSpecialization()
	{
		System.out.println("enter specialization");
		specialization=sc.next();
	}
	public void printSpecialization()
	{
		System.out.println("specialization:"+specialization);
	}
}
class Manager extends Employee
{
	String department;
	public void setDepartment()
	{
		System.out.println("enter department");
		department=sc.next();
	}
	public void printDepartment()
	{
		System.out.println("department:"+department);
	}
}
