class Version
{
	public static void main (String[]args)
	{
		System.out.println("version of java:");
		System.out.println(System.getProperty("java.version"));

		System.out.println("path of java compiler:");
		System.out.println(System.getProperty("java.class.path"));

		System.out.println("path of java:");
		System.out.println(System.getProperty("java.home.url"));

		System.out.println("vendor of java:");
		System.out.println(System.getProperty("java.vendor"));

		System.out.println("vendor of java url:");
		System.out.println(System.getProperty("java.vendor.url"));
	}
}

