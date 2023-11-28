import java.util.Scanner;
public class MultiplicationTable {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int num1,num2,num3;
		System.out.println("Enter the table you want to run by thread1 : ");
		num1=sc.nextInt();
		MyThread1 thread1=new MyThread1(num1);
		System.out.println("Enter the table you want to run by thread2 : ");
		num2=sc.nextInt();
		MyThread1 thread2=new MyThread1(num2);
		System.out.println("Enter the table you want to run by thread3 : ");
		num3=sc.nextInt();
		MyThread1 thread3=new MyThread1(num3);
		thread1.start();
		thread2.start();
		thread3.start();
	}

}
class MyThread1 extends Thread
{
	int number;
	MyThread1(int numb1)
	{
	this.number=numb1;
	}
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(number+"*"+i+"= "+(number*i));
		}
		System.out.println();
	
	}
	
}
