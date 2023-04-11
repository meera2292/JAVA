import java.util.*;
class MaxAndMinArray
{
	public static void main(String args[])
	{
		int arr[]=new int[5];
		Scanner obj=new Scanner(System.in);	
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter your elements of array:");
			arr[i]=obj.nextInt();
		}
		
		Arrays.sort(arr);
		for(int j=0;j<arr.length;j++)
		{
			System.out.println(arr[j]);
			
		}
		
		System.out.println("Largest Number is:"+arr[arr.length-1]);
		System.out.println("Smallest Number is:"+arr[0]);
		System.out.println("Second largest number  is:"+arr[arr.length-2]);
		
	}
}