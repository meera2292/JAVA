import java.util.*;
class demolinkedlist
{
	public static void main(String args[])
	{
		LinkedList<String> linklist=new LinkedList<>();
		Scanner obj=new Scanner(System.in);
        for(int i=0;i<5;i++)
		{
			System.out.println("enter your Linked List  items::");
			linklist.add(i,obj.next());
		}

		System.out.println("Linked list  list elements");

		Iterator<String> it=linklist.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		obj.close();
	}
}