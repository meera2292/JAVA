public class PrimeNumberSum
 {
    public static int[] plist(int number) 
    {
        
        int a[] = new int[number];
        for (int i = 1; i <= number; i++) 
        {
          
            int  count = 0;
            for (int j = 2; j <= i / 2; j++) 
            {
                if (i % j == 0) 
                {
                    count++;
                    a[i]=i;
                    break;
                }
            }

            if (count == 0) 
            {
                for (int k:a) 
                {
                    System.out.println(k);
                }
                
            }

        }
        return a;
       
    }
    public static void main(String args[]) 
    {
        System.out.println(plist(3));
    }
}
