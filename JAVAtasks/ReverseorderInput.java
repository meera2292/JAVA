import java.util.*;
class ReverseorderInput
{
	public static void main(String args[])
	{
		
		int size;
		System.out.println("Enter the size of array");
		Scanner obj=new Scanner(System.in);
		
		size=obj.nextInt();
		int a[]=new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter your array value::");
			a[i]=obj.nextInt();
		}
		for(int j=a.length-1;j>=0;j--)
		{
		 	System.out.println(a[j]);
		}
		
	}
}


public static int change(int number) {
        int reverse = 0;  
        while(number != 0)   
        {  
            int remainder = number % 10;  
            reverse = reverse * 10 + remainder;  
            number = number/10;  
        }  

    return reverse;
    }