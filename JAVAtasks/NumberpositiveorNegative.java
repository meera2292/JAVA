import java.util.*;
class NumberpositiveorNegative{
	public static void main(String args[])
	{
		
		int num;
		Scanner obj= new Scanner(System.in);
		System.out.println("Enter the number");
		num=obj.nextInt();
		if(num<0)
		{
			System.out.println("Its a negative number");
		}
		if(num>=0)
		{
			System.out.println("Its a Positive number");
		}

			
		
		
	}
}