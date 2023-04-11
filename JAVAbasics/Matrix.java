import java.util.*;
class Matrix
{
	public static void main(String args[])
	{
		int i,j,r,c;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the number of Rows::");
		r=obj.nextInt();
		System.out.println("Enter the number of Columns::");
		c=obj.nextInt();
		int a[][]=new int[r][c];
		int arr[]=new int[r*c];
		System.out.println("Enter your numbers of "+r+" X "+c+" Matrix::");
		for(int k=0;k<arr.length;k++)
		{
			System.out.print("   Enter your element:::");
			arr[k]=obj.nextInt();
		}
                    for(int k:arr)
		{
			System.out.println(k);
		}
		System.out.println("********  Matrix ********");
		try
		{

			for(i=0;i<r;i++)
			{
				for(j=0;j<c;j++)
			
				{
				
					a[i][j]=arr[j];
					
					System.out.print(a[i][j]+" ");
				}
				System.out.println(" ");
				}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Error in ArrayIndexOutOfBoundsException" );
		}
	}
}