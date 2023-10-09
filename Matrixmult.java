

import java.util.Scanner;

public class Matrixmult {

public static void main(String []args) {

Scanner sc=new Scanner(System.in);

int row1,col1;

System.out.println("Enter number of rows and columns of the first matrix:");

row1=sc.nextInt();

col1=sc.nextInt();

System.out.println("Enter elements of the first matrix:");

int [][] mat1=new int [row1][col1];

int i,j;

for( i=0;i<row1;i++)

{

for( j=0;j<col1;j++) {

mat1 [i][j]=sc.nextInt();

}

}

System.out.println("First matrix\n");

for( i=0;i<row1;i++)

{

for( j=0;j<col1;j++) {

System.out.print(mat1[i][j]+"\t");

}

System.out.println();

}

int row2,col2;

System.out.println("Enter number of rows and columns of the second matrix:");

row2=sc.nextInt();

col2=sc.nextInt();

int [][] mat2=new int [row2][col2];

System.out.println("Enter elements of the second matrix:");

for(i=0;i<row2;i++) {

for(j=0;j<col2;j++) {

mat2 [i][j]= sc.nextInt();

}

}

System.out.println("Second matrix:");

for(i=0;i<row2;i++) {

for(j=0;j<col2;j++) {

System.out.print(mat2[i][j]+"\t");

}

System.out.println();

}

int [][]matrix=new int [row2][col1];

if(col1==row2) {

for(i=0;i<row2;i++) {

for(j=0;j<col1;j++) {

matrix[i][j]=0;

for(int k=0;k<col1;k++) {

matrix[i][j]=matrix[i][j]+(mat1[i][k]*mat2[k][j]);

}

}

}

System.out.println("Final matrix:");

for(i=0;i<row2;i++) {

for(j=0;j<col1;j++) {

System.out.print(matrix[i][j]+"\t");

}

System.out.println();

}

}

else {

System.out.println("Matrix multiplication not possible");

}

}

}


