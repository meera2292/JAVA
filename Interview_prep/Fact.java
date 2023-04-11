import java.util.*;
class Fact
{
    public static void main(String args[]) {

        int num;
        float fact=1;
        Scanner obj=new Scanner(System.in);
        
        System.out.println("Enter the number");
        num=obj.nextInt();
        for(int j=1;j<=num;j++)
        {
            fact=fact*j;
        }
        System.out.println("factorial is"+fact);
        
    }
}