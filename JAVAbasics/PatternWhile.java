import java.util.*;
class Foreacheg{
	public static void main(String args[])
	{
		int arr[]=new int[5];
		System.out.println("Enter your array");
		Scanner obj= new Scanner(System.in);
		for(int i:arr)
		{
			arr[i]=obj.nextInt();
			System.out.println(arr[i]);
		}

	}
}