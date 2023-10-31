package javaproject;
import java.util.Scanner;
public class SmallestElement {
	public static void main(String[]args)
	{
		int n,i,temp,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array");
		n=sc.nextInt();
		int array[]=new int[n];
		System.out.println("enter the elements of the array");
		for(i=0;i<n;i++)
		{
		array[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
			if(array[i]>array[j])
			{
				temp=array[i];
				array[i]=array[j];
				array[j]=temp;
			}
		}
		}
		for(i=0;i<n;i++)
		{
			System.out.print(array[i]+"\t");
		}
		System.out.println();
		System.out.println("second smallest element is :"+array[1]);
		
	}

}
