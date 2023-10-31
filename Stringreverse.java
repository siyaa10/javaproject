package javaproject;
import java.util.Scanner;
public class Stringreverse {
	public static void main(String[]args)
	{
		String sentence;
		char array1[],array2[];
		int i,len;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		sentence=sc.next();
		array1=sentence.toCharArray();
		len=sentence.length();
		array2=new char[len];
		System.out.println("reversed string is :");
		for(i=0;i<len;i++)
		{
			array2[i]=array1[len-i-1];
			System.out.print(array2[i]);
		}
		    
		
	}

}
