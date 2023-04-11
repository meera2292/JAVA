public class Fibonacci 
{
    public static int fibonacciseries(int range) 
    {
        int f = 0, s = 1, t, i, sum=1;
        if (range == 0) 
        {
            return 0;
        } 
        else 
        {
            for (i = 2; i < range; ++i)
             {
                t = f + s;
                sum = sum + t;
                f = s;
                s = t;
            }
            return sum;
        }
    }
    public static void main(String args[]) 
    {
        System.out.println(fibonacciseries(10));
        
    }
}