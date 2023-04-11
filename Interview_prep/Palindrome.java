import java.util.*;
class Palindrome{
    public static void main(String args[]) 
    {
        
        String str="Sindhu";
        String rev;
        StringBuilder sbr=new StringBuilder(str);
        rev=String.valueOf(sbr.reverse());
        System.out.println(str);
        System.out.println(rev);
        if(rev.equalsIgnoreCase(str))
        {
            System.out.println("Palindrome");
        }


    }
}