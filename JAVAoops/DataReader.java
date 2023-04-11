import java.io.*;
public class DataReader
{
	public static void main(String args[])
	{
		DataInputStream dis=new DataInputStream(new FileInputStream("D:\\Java\\JAVAoops\\Source.txt"));
		DataOutputStream dos=new DataOutputStream(new FileOutputStream("D:\\Java\\JAVAoops\\Destination.txt"));
		String Count;
		while((Count=dis.readLine())!=null)
		{
			String data=Count.toUpperCase();
			System.out.println(data+ "  ,  ");
			dos.writeBytes(data+"   ,  ");
		}
		dis.close();
		dos.close();
				
	}
}