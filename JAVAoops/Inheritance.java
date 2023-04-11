import java.util.*;
class Hod
{
	void assigning()
	{
		Scanner obj=new Scanner(System.in);
		int no_of_techers;
		String Taskname;
		System.out.println("Enter your Task Name");
		Taskname=obj.next();
		System.out.println("Enter the number of teachers");
		no_of_techers=obj.nextInt();
		if(no_of_techers<3)
		{
			System.out.println("Please Assign more teachers");
		}
	}
}


class Teachers extends Hod
{
		Scanner obj=new Scanner(System.in);
		void preparation()
		{
			int no_ppts;
			int no_of_classes;
			String name;
			System.out.println("Enter your number of classes");
			no_of_classes=obj.nextInt();
			System.out.println("Enter the number of ppts");
			no_ppts=obj.nextInt();
			System.out.println("Enter Teacher Name");
			name=obj.next();
		}
}
class Student extends Teachers
{
	Scanner obj=new Scanner(System.in);
	void learn(int count)
	{
		String Sname;
		float marks;
		System.out.println("Enter Student Name");
		Sname=obj.next();
	}
}

public class Inheritance
{
	Scanner obj=new Scanner(System.in);
	public static void main(String args[])
	{
		Student s=new Student();
		s.assigning();
		s.preparation();
		System.out.println("Enter the number of students in batch");
		s.learn();
	}
}
			
			

		
		