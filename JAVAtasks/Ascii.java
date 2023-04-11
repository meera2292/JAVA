import java.util.*;
public class Ascii 
{
	public static void main(String[] args)
	{
		
			char ch ;
			Scanner obj=new Scanner(System.in);
			System.out.println("Enter any character: "  );
			ch=obj.next().charAt(0);
			int ascii = ch;
			System.out.println("The ASCII value of  " + ch );
			System.out.println(ascii);
	}
}
