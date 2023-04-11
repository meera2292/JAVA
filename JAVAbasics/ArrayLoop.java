import java.util.*;
class ArrayLoop
{
	public static void main(String args[])
	{
		int a[]={1,2,3};
		for(int i=0;i<3;i++)
		{
			System.out.println(a[i]);
		}
		int  b[]= new int[5];//integer array
		String s[]=new String[5];
		System.out.println("Enter your new array");
		Scanner obj=new Scanner(System.in);
		for(int j=0;j<s.length;j++)
		{
			s[j]=obj.next();
			System.out.println(s[j]);

		}
		
		
	}
}


