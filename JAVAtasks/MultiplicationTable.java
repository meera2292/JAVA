import java.util.*;
class MultiplicationTable
{
	public static void main(String args[])
	{
		int num,limit;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter your number:");
		num=obj.nextInt();
		System.out.println("Enter your Limit:");
		limit=obj.nextInt();
		System.out.println("Multiplication Table");
		for(int i=1;i<=limit;i++)
		{
			System.out.println(num+"X "+i+" = "+num*i);
			
			
		}
		
		
	}
}