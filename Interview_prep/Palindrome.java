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
        Palindrome p=new Palindrome();
        System.out.println(p.reverse("POPS"));


    }
    public  String reverse(String src)
    {
        if(src==null || src.isEmpty())
        {
            return "Its empty";
        }

        String reversed=""; 

        for(int i=src.length()-1;i>=0;i--)
        {
            reversed=reversed+src.charAt(i);
        }
        return reversed;
    }
}