
import java.util.*;
class Ifelse
{
	public static void main(String args[])
	{
		int mark,grade;
		System.out.print("Enter your Marks");
		Scanner obj=new Scanner(System.in);
		mark=obj.nextInt();
		if(mark>=95 && mark<=100)
		{
			System.out.println("You have grade A");
		}
		if(mark>=90 && mark<=94)
		{
			System.out.println("You have grade B");
		}
		if(mark>=80 && mark<=89)
		{
			System.out.println("You have grade c");
		}
	}
}
		


