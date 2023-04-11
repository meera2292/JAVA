import java.util.*;
class EvenNumbers
{
	public static void main(String args[])
	{
		int a,b;
		int arr[]=new int[102];
		/*System.out.println("Enter your range");
		Scanner obj=new Scanner(System.in);
		a=obj.nextInt();*/
		for(int i=0;i<=arr.length;i++)
		{
			if(i%2==0)
			{
				arr[i]=i;
				System.out.println(arr[i]);
			}
			
		}
		
	}
}