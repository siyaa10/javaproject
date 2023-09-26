/*
 * file:sum of positive numbers
 * description:to find sum of positive numbers
 * author:Siya
 * version:1.0
 * date:26/9/2023
 */
package sumofpositivenum.java;
import java.util.Scanner;
public class sumofpositivenum {
	public static void main(String[]args) {
		int number,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		number=sc.nextInt();
		while(number>0)
		{
			sum=sum+number;
			System.out.println("enter the next number");
			number=sc.nextInt();

		}
		System.out.println("sum of the numbers is "+sum);
	}

}
