import java.util.*;
class Student13
{
	void display()
	{
		Scanner obj=new Scanner(System.in);
		int age;float Assessmentmarks;
		String Qualificationnname,Sname;
		
		System.out.println("Enter your name");
		Sname=obj.next();
		switch(Sname)
		{
			case "Jak": 	System.out.println("Age:21");
					System.out.println("B-Tech");
					System.out.println("100");
					break;
			case "Joe": 	System.out.println("Age:23");
					System.out.println("B.Com");
					System.out.println("100");
					break;
			case "Miya":System.out.println("Age:22");
					System.out.println("MSW");
					System.out.println("100");
					break;
			case "Kitchu":System.out.println("Age:24");
					System.out.println("MCA");
					System.out.println("100");
					break;
			default:	System.out.println("Student not present");
			
		}
	}
}


class Fullstack extends Student13
{
		Scanner obj=new Scanner(System.in);
		void jobrole()
		{
			int no_projects;
			int salary;
			String rolename;
			System.out.println("Enter your number of Projects");
			no_projects=obj.nextInt();
			System.out.println("Enter your Salary");
			salary=obj.nextInt();
			System.out.println("Enter JobRole");
			rolename=obj.next();
		}
}
class Webdevelopment extends Fullstack
{
	Scanner obj=new Scanner(System.in);
	void salary()
	{
		int salary;
		System.out.println("Enter your previous salary");
		salary=obj.nextInt();
	}
}

public class InheritanceTaskOne
{
	Scanner obj=new Scanner(System.in);
	
	public static void main(String args[])
	{
		Webdevelopment w=new Webdevelopment();
		w.display();
		w.jobrole();
		w.salary();
		
	}
}
			
			

		
		