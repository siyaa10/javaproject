/*
 * file:sum of numbers
 * description:to find sum of n numbers
 * author:Siya
 * version:1.0
 * date:26/9/2023
 */

package sumofNnumbers;
import java.util.Scanner;
public class sumofNnumbers {
	public static void main(String[]args)
	{
		int i,sum=0,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of n");
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			System.out.println(i);
			sum=sum+i;
		}
		System.out.println("sum is"+sum);
	}

}
