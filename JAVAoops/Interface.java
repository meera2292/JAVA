
import java.util.*;
interface Area
{
	public void Circle();
	public void Square();
	public void Triangle();
}
 interface Circumference
{
	public static void Circle()
	{
		double radius;
		System.out.println("Enter your radius");
		Scanner obj=new Scanner(System.in);
		radius=obj.nextDouble();
		System.out.println("Circumference is "+(2*3.14*radius));
	}
          public static void display()
	{
		System.out.println("java is interesting");
	}
}
class CircleArea implements Area,Circumference
{
		public void Circle()
		{
			double radius;
			System.out.println("Enter your radius");
			Scanner obj=new Scanner(System.in);
			radius=obj.nextDouble();
			System.out.println("Area is "+(3.14*radius*radius));
		}
		public void Square()
		{
			int side;
			System.out.println("Enter side of square");
			Scanner obj=new Scanner(System.in);
			side=obj.nextInt();
			System.out.println("Area is "+(side*side));
		}
		public void Triangle()
		{
			int tside;
			System.out.println("Enter side of Triangle");
			Scanner obj=new Scanner(System.in);
			tside=obj.nextInt();
			System.out.println("Area is "+120);
		}
		
			
}
class Interface
{
	public static void main(String args[])
	{
		CircleArea c=new CircleArea();
		c.Circle();
		c.Square();
		c.Triangle();
		/*Circumference cir=new Circumference();// no need of this since function is static member no object even interface*/
		
		Circumference.Circle();
		Circumference.display();
	}
}
	


	