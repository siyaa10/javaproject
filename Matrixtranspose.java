package javaproject;
import java.util.Scanner;
public class Matrixtranspose {
	public static void main(String[]args)
	{
		int row1,col1,i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the rows and columns of the matrix");
		row1=sc.nextInt();
		col1=sc.nextInt();
		System.out.println("enter the elements of the matrix");
		int mat1[][]=new int[row1][col1];
		int mat2[][]=new int[row1][col1];
		for(i=0;i<row1;i++)
		{
			for(j=0;j<col1;j++)
			{
				mat1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Fisrt matrix");
		for(i=0;i<row1;i++)
		{
			for(j=0;j<col1;j++)
			{
				System.out.print(mat1[i][j]+"\t");
			}
			System.out.println();
		}
		for(i=0;i<row1;i++)
		{
			for(j=0;j<col1;j++)
			{
				mat2[j][i]=mat1[i][j];
			}
		}
		System.out.println("transpose of the matrix :");
		for(i=0;i<col1;i++)
		{
			for(j=0;j<row1;j++)
			{
				System.out.print(mat2[i][j]+"\t");
			}
			    System.out.println();
		}
	}
}
