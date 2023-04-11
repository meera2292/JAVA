import java.util.*;
class demoarray
{
	public static void main(String args[])
	{
		ArrayList<String> arrlist=new ArrayList<>();
		Scanner obj=new Scanner(System.in);
        for(int i=0;i<5;i++)
		{
			System.out.println("enter your array items::");
			arrlist.add(i,obj.next());
		}

		System.out.println("Array list elements");
		for(String str:arrlist)
		{
				System.out.println(str);
		}
	}
}