import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class FileReadWrite {
	public static void main(String[]args)
	{
		char[]data=new char[50];
		FileReader input=null;
		FileWriter output=null;
		String value="This is the data";
		FileWriter inputdata=null;
		try
		{
			inputdata=new FileWriter("file1.txt");
			inputdata.write(value);
			inputdata.flush();
			inputdata.close();
			input=new FileReader("file1.txt");
			int bytes=input.read(data);
			System.out.println("Data is :::::"+bytes);
			input.close();
			output=new FileWriter("file2.txt");
			output.write(data,0,bytes);
			output.flush();
			output.close();
		}
		catch(IOException e)
		{
			System.out.println("There is an error");
			e.printStackTrace();
		}
	}

}
