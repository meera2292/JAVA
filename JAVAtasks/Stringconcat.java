
import java.util.*;
class Stringconcat
{
	public static void main(String args[])
	{
		String Fname,Sname,Fullname;
		System.out.print("Enter your First Name");
		Scanner obj=new Scanner(System.in);
		Fname=obj.nextLine();
		System.out.print("Enter your Second Name");
		Sname=obj.nextLine();
		Fullname=Fname+Sname;
		System.out.println(Fullname);
		
	}
}
		


