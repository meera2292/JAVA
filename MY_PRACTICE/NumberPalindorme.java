public class NumberPalindorme 
{
    public static boolean is_palindrome(int a) 
    {
        int reverse = 0; int n = a;
        while (a != 0) 
        {
            int remainder = a % 10;
            reverse = reverse * 10 + remainder;
            a = a/10;
        }
        if (n == reverse)
        {
            return true;
        }
        else
        {
            return false;
        }   
       
    }

    // --- Don't Edit the code ---------//
    public static void main(String arg[]) {
        System.out.println(is_palindrome(121));
        // --- Don't Edit the code ---------//
    }
    
}