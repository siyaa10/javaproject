package addition;
import java.util.Scanner;

public class addition {
	public static void main(String[]args) {
		int number1,number2,sum;
		Scanner sc=new Scanner(System.in);
		number1=sc.nextInt();
		number2=sc.nextInt();
		sum=number1+number2;
		System.out.print("sum="+sum);
	}

}
