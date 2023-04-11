import java.io.*;
public class ByteSteamTest
{
	public static void main(String args[]) throws IOException
	{
		ByteArrayOutputStream boutput=new ByteArrayOutputStream(12);
		System.out.print("Enter a string");
		while(boutput.size()!=10)
		{
			//gets the input from the user
			
			boutput.write(System.in.read());
		}
		
		byte b[]=boutput.toByteArray();
		System.out.println("Prnt the content");
		for(int x=0;x<b.length;x++)
		{
			//printing the characers
			System.out.print((char)b[x] +"   ");
		}


		System.out.println("   ");
		int c;
		ByteArrayInputStream bInput=new ByteArrayInputStream(b);	
		System.out.println(" Converting characters to upper  case");
		for(int y=0;y<1;y++)
		{
			while((c=bInput.read())!=-1)
			{
				System.out.println(Character.toUpperCase((char ) c));
			}
			bInput.reset();
		}
	}
}



		

