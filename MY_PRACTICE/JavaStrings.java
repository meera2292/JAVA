public class StringCompare {
    public static boolean compare(String s1, String s2) {
        if (s1.equals(s2)) {

            return true;

        } 
        else 
        {
            return false;
        }
    }
    
    public static void main(String args[]) {
        System.out.println(compare("MiLa", "mila"));
    }
}