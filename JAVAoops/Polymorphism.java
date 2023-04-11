import java.util.*;
class Calculator
{
		public int add(int a,int b)
		{
			Scanner obj=new Scanner(System.in);
			int c=a+b;
			System.out.println(c);
			return c;
		}
		public int sub(int a,int b)
		{
			Scanner obj=new Scanner(System.in);
			int c=a-b;
			System.out.println(c);
			return c;
		}
		public int add(int a,int b,int c)//same function name with same name different arguments METHOD OVERLOADING
		{
			Scanner obj=new Scanner(System.in);
			int d=a+b+c;
			System.out.println(d);
			return d;
		}
		public int sub(int a,int b,int c)//same function name with same name different arguments METHOD OVERLOADING
		{
			Scanner obj=new Scanner(System.in);
			int d=a-b-c;
			System.out.println(d);
			return d;
		}
}
class Display extends Calculator
{

	public int add(int a,int b)
		{
			System.out.println("Product of two numbers");
			int c=a*b;
			System.out.println(c);
			return c;
		}
		public int sub(int a,int b)
		{
			System.out.println("Mod of two numbers");
			int c=a%b;
			System.out.println(c);
			return c;
		
		}
		public int add(int a,int b,int c)//same function name with same name different arguments METHOD OVERRIDING
		{
			System.out.println("Product of three numbers");
			int d=a*b*c;
			System.out.println(d);
			return d;
		}
		public int sub(int a,int b,int c)//same function name with same name different arguments METHOD OVERRIDING
		{
			System.out.println("Mod  of three numbers");
			int d=a%b%c;
			System.out.println(d);
			return d;
		}

}


class Polymorphism
{ 
	public static void main(String args[])
	{
		Calculator calc=new Calculator();
		calc.add(1,2);
		calc.sub(1,2);
		calc.add(1,2,3);
		calc.sub(1,2,3);
		Display d=new Display();
		d.add(3,2);
		d.sub(7,2);
		d.add(5,8,9);
		d.sub(9,9,9);
	}
}
		
		
