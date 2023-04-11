import java.util.*;
class InsertElementInPosition{
	public static void main(String args[])
	{
		int arr[]=new int[5];
		int index=0;
		Scanner obj= new Scanner(System.in);
		System.out.println(Enter the position Index");
		index=obj.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter your elements of array:");
			
			arr[i]=obj.nextInt();
		}
		for(int j:arr)
		{	if(j==index)
			{
		
				System.out.println(j);
			}
			
		}
		

	}
}