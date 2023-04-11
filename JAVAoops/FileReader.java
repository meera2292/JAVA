import java.io.*;
public class FileReader
{
	public static void main(String args[])
	{
		char c;
		String str;
		BufferedReader  br=new  BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter lines of text");
		System.out.println("Enter 'end' to quit");
		try{
			do
			{
				/*c=(char) br.read();//reading single characters*/
				str=br.readLine();//
				System.out.println(str);
			}while(!str.equals("end"));
		}
		catch(Exception e)
		{
			System.out.println(e);
			e.printStackTrace();
		}
	}
}