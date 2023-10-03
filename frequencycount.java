/*
 * file:frequency count
 * description:to find the frequency of a character in a string
 * author:Siya
 * version:1.0
 * date:03/10/2023
 */

package frequencycount.java;
import java.util.Scanner;
public class frequencycount {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String input=sc.nextLine();
		System.out.println("enter the character to be checked");
		char Checkme=sc.next().charAt(0);
		int freq=checkFreq(input,Checkme);
		System.out.println("number of occurances of the character:"+freq);
		
	}
	static int checkFreq(String input,char Checkme)
	{
		char[]charArray=input.toCharArray();
		int charCount=0;
		for(int i=0;i<input.length();i++)
		{
			if(charArray[i]==Checkme)
					{
					charCount++;
					}
		}
	
return charCount;
	}
}
