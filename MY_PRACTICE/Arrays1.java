import java.util.*;
class Arrays1
{

public static void main(String []args)
{
   
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter thr size of your array:::");
    int size;
    size=obj.nextInt();
    int[] arr=new int[size];
    for(int i=0;i<size;i++)
    {
        System.out.println("Enter your array Element"+i+"::");
        arr[i]=obj.nextInt();

    }
    System.out.println("Your array elements are:");
    System.out.println("___________________________________");
    for(int j:arr)
    {
        System.out.println(j);
    }


}
    
}
