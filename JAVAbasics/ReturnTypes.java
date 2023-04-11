import java.util.*;
class ReturnTypes
{
		public static void main(String args[])
		{
			ReturnTypes r=new ReturnTypes();
			System.out.println(r.functionF());
			System.out.println(r.functionS());
			next n=new next();
			System.out.println(n.c);
			System.out.println(n.name);
			System.out.println("HI contructor");
			System.out.println("its me ");
			
		}
		float functionF()
		{
			float a=2,b=3,c;
			c=a*b;
			return c;	
		}
		String functionS()
		{
			String x="Meera",y=" Mila";
			String z=x+y;
			return z;
		}
		
}
class next
{
	int c;
	String name;
	next()
		{
			System.out.println("constructor called here");
		}
		
}

