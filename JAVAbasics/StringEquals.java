
import java.util.*;
class StringEquals
{
	public static void main(String args[])
	{
		String name;
		System.out.print("Enter your name");
		Scanner obj=new Scanner(System.in);
		name=obj.next();
		if(name.equalsIgnoreCase("MEERA"))
		{
			System.out.println("You are Meera");
		}
		else if(name.toLowerCase().equals("sowntharya"))
		{
			System.out.println("You are Sowntharya");
		}
		else if(name.equals("Heera"))
		{
			System.out.println("You are Heera");
		}
		else
		{
			System.out.println("You are Tom");
		}
	}
}
		

