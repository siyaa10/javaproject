/*
 * file:attendance percentage
 * description:to display mark based on attendance percentage
 * author:Siya
 * version:1.0
 * date:26/9/2023
 */

package attendancepercentage.java;
import java.util.Scanner;

public class attendancepercentage {
	public static void main(String[]args) {
		int attendance;
		float mark;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the attendance percentage");
		attendance=sc.nextInt();
		if(attendance>=90)
		{
			System.out.print("mark is 10");
		}
		else
		{
			mark=(float)(attendance/10);
			System.out.println("mark is"+mark);
		}
		
	}

}
