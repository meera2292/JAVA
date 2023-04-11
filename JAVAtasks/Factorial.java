import java.util.*;
class Factorial
{
	public static void main(String args[])
	{
		int a;
		float fact=1;
		System.out.println("Enter your Number");
		Scanner obj=new Scanner(System.in);
		a=obj.nextInt();
		for(int i=1;i<=a;i++)
		{
			fact=fact*i;
		}
		
		System.out.println(fact);
	
		
		
	}
}