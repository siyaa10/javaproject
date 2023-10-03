/*
 * file:palindrome
 * description:to find whether a agiven string is palindrome or not
 * author:Siya
 * version:1.0
 * date:03/10/2023
 */

package palindrome.java;
import java.util.Scanner;
public class palindrome {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string:");
		String input=sc.next();
		boolean isPalindrome=check(input);
		if(isPalindrome)
		{
			System.out.println("the given string is palindrome");
		}
		else
		{
			System.out.println("the given string is not palindrome");
		}
	}
		static boolean check(String input)
		{
			char[] charArray=input.toCharArray();
			int length=input.length();
			for(int i=0;i<length/2;i++)
			{
				if(charArray[i]!=charArray[length-i-1])
				{
					return false;
				}
			}
			return true;
		
		
	}

}
