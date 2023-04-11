
import java.util.*;
class Task5Goodorbad
{
    public static void main(String []args)
    {
        int i = 0;
        String numbers = "";
        int count = 0;
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> intarray = new ArrayList<Integer>();
        try
        {
            int size = sc.nextInt();
            
            while ( sc.hasNext() )
            {
                intarray.add(sc.nextInt());
                count++;
                if ( size == count )
                {
                    break;
                }
            }
        }
        catch(Exception e)
        {
            System.out.println("Not Number");
            System.exit(0);
        }

        sc.close();

        for ( int j : intarray)
        {
            System.out.print(j);
        }
        for ( i = 0; i < intarray.size(); i++ )
        {
            numbers += intarray.get(i) % 10;
        }
        if ( ( Integer.parseInt(numbers) % 10 )  == 0 )
        {
            System.out.println("\nYes");
        }
        else
        {
            System.out.println("\nNo");
        }
    }
}