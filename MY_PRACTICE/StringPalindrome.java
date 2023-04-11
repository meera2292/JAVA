public class StringPalindrome 
{
    public static boolean isStrPalindrome(String str) 
    {
        StringBuilder sbr = new StringBuilder(str);
        String rev= String.valueOf(sbr.reverse());
        if (str.equals(rev)) 
        {
            return true;
        } else
        {
            return false;
        }
       
    }
    public static void main(String args[]) {
        System.out.println(isStrPalindrome("abba"));
    }
}
