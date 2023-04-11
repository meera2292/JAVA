class Test
{
    private int empid;
	private String name;
	public int getEmpid()
	{
		return empid;
	}
	public String getName()
	{
		return name;
	}
	public void setEmpid(int eid)
	{
		this.empid=eid;
	}
	public void setName(String sname)
	{
		this.name=sname;
	}
}
class Employee
{
	public static void main(String args[])
	{
		Test e=new Test();
		e.setEmpid(123);
		e.setName("Meera");
		System.out.println("Employee Id="+e.getEmpid());
		System.out.println("Employee Name="+e.getName());
	}
}



