package gradeofmarks;
import java.util.Scanner;
public class gradeofmark {
	public static void main(String[]args) {
		int percentage;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the percentage of marks");
		percentage=sc.nextInt();
		if(percentage>=90)
		{
			System.out.println("grade is S");
		}
		else if(percentage<90&&percentage>=85)
		{
			System.out.println("grade is A+");
		}
		else if(percentage<85&&percentage>=80)
		{
			System.out.println("grade is A");
		}
		else if(percentage<80&&percentage>=70)
		{
			System.out.println("grade is B");
		}
		else if(percentage<70&&percentage>=60)
		{
			System.out.println("grade is C");

		}
		else if(percentage<60&&percentage>=50)
		{
			System.out.println("grade is D");
		}
		else if(percentage<50&&percentage>=40)
		{
			System.out.println("grade is E");

		}
		else
		{
			System.out.println("fail");

		}

		
		
		
		
	}

}
