


public class NumberReverseUsingStrings
{
    public static int change(int number)
    {
        String str = String.valueOf(number);
        StringBuilder sb = new StringBuilder(str);
        str = String.valueOf(sb.reverse());
        int renum = Integer.valueOf(str);
        return renum;
    }
    public static void main(String args[]) {
       
       System.out.println(change(121));
   }
}
