import java.util.*;
class Switch
{
		public static void main(String args[])
		{
			String symb;
			System.out.println("Enter a Symbol");
			Scanner obj=new Scanner(System.in);
                          symb=obj.next();
			switch(symb)
			{
				case "/":System.out.println("BackSlash");
				case "~":System.out.println("Tild");
					 break;
				case "*":System.out.println("Asterisk");
					 break;
				case "%":System.out.println("Mod");
					 break;
				case "&":System.out.println("Ampersand");
					 break;
				case "#":System.out.println("Hash");
					 break;
				case "$":System.out.println("Dollar Sign");
					 break;
				case "!":System.out.println("Exclamation");
					 break;

				default:System.out.println("Invalid Symbol");
			}
		}
}
						
