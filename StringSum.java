/*
 * file:StringSum
 * description:to find the sum of an integer string using stringtokenizer
 * author:Siya
 * version:1.0
 * date:28/11/2023
 */

package palindrome.java;
import java.util.Scanner;
import java.util.StringTokenizer;
public class StringSum {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the integer string :");
		String input=sc.nextLine();
		StringTokenizer object=new StringTokenizer(input);
		int NoOfTokens=object.countTokens();
		System.out.println("Number of tokens : "+NoOfTokens);
		int sum=0;
		while(object.hasMoreTokens())
		{
			int num=Integer.parseInt(object.nextToken());
			sum=sum+num;
		}
		System.out.println("sum of integers is : "+sum);
	}

}
