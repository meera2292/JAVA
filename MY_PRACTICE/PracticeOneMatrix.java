import java.util.*;
class PracticeOneMatrix 
{

    public static void main(String args[])
    {

        Scanner obj=new Scanner(System.in);
        System.out.println("Enter your size");
        int size=obj.nextInt();
    
        int[] a=new int[size];
        for(int i=0;i<size;i++)
        {
            System.out.println("Enter thr elements");
            a[i]=obj.nextInt();
        }
        
    }
 
    
}
