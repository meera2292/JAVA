import java.util.*;
class SimpleCalculator
{
		public static void main(String args[])
		{
			float a=0f;
			float b=0f;
			String ch;
			Scanner obj=new Scanner(System.in);
			System.out.println("Enter your first number");
			a=obj.nextFloat();
			System.out.println("Enter your Second number");
			b=obj.nextFloat();
			System.out.println("Enter your opertaor -> +, -, *, %, /");
			System.out.println("Using Switch");
			ch=obj.next();
			switch(ch)
			{
				case"+": System.out.println(a+b);
					     break;
				case"-": System.out.println(a-b);
					     break;
				case"*": System.out.println(a*b);
					     break;
				case"/": System.out.println(a/b);
					     break;
				case"%": System.out.println(a%b);
					     break;
				default:  System.out.println("Invalid operator");
			}
			System.out.println("Using if-else");
			if(ch.equals("+"))
			{
				System.out.println(a+b);
			}
			else if(ch.equals("-"))
			{
				System.out.println(a-b);
			}
			else if(ch.equals("*"))
			{
				System.out.println(a*b);
			}
			else if(ch.equals("/"))
			{
				System.out.println(a/b);
			}
			else if(ch.equals("%"))
			{
				System.out.println(a%b);
			}
			else
			{
				System.out.println("Invalid operator");
			}
				
		}
}
