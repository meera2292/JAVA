
package org.coursera.lab.intpalindrome;

public class NumberPalindromeStrings
{
    public static boolean is_palindrome(int a) 
    {
        String str = String.valueOf(a);
        StringBuilder sb = new StringBuilder(str);
        str = String.valueOf(sb.reverse());
        int renum = Integer.valueOf(str);

        if (a == renum)
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
        System.out.println(is_palindrome(1210123));
        // --- Don't Edit the code ---------//
    }
}