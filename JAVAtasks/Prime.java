import java.util.*;
class Prime
{
	public static void main(String args[])
	{
		int a; int p=0;
		System.out.println("Enter your Number");
		Scanner obj=new Scanner(System.in);
		a=obj.nextInt();
		for(int i=2;i<=a/2;i++)
		{
			if(a%i==0)
			{
				p=1;
			}
			
		}
		if(p==1)
		{
			System.out.println("It not a prime number");
		}
		else if(p==0)
		{
			
			System.out.println("It a prime");
		}
		else
		{
			System.out.println("It a invalid number. Please enter a valid input");
		}
		
		
	}
}