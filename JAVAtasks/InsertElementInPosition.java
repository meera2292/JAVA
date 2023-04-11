import java.util.*;
class InsertElementInPosition{
	public static void main(String args[])
	{
		int arr[]=new int[5];
		int index=0,num;
		Scanner obj= new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter your elements of array:");
			arr[i]=obj.nextInt();
		}
		System.out.println("Enter the position Index");
		index=obj.nextInt();
		System.out.println("Enter the number to be replaced");
		num=obj.nextInt();
		arr[index]=num;
		for(int i:arr)
		{
			System.out.println(i);
		}
		
	}
}