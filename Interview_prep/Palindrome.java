import java.util.*;
class Palindrome{
    public static void main(String args[]) {
        
        String str="Malayalam";
        StringBuilder sbr=new StringBuilder(str);
        str=String.valueOf(sbr.reverse());
        System.out.println(str);


    }
}