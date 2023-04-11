public class FindMaxArray 
{
    public static int findmax(Object[] input) 
    {
        int max = -999999999;
        for (int i = 0; i < input.length; i++) 
        {
            if ((int) input[i] > max) 
            {
                max = (int) input[i];
            }
        }
        return max;
       
    }
    
    public static void main(String[] args) 
    {
        Object[] a = { -1, -2, -3, -6, -8, -10, -1 };
        System.out.println(findmax(a));
    }
}
