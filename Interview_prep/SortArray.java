import java.util.*;
class SortArray
{
    public static void main(String args[])
    {
       
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size;
        size=obj.nextInt();
        int[] arr=new int[size];
        for(int m=0;m<size;m++)
        {
            System.out.println("Enter your elements in array");
            arr[m]=obj.nextInt();
        }
        sort(arr);
    }
    public static void sort( int input[])

    {
        for(int i=0;i<input.length;i++)
        {
            int max=0;
            for(int j=i+1;j<input.length;j++)
            {
                    if(input[i]>input[j])
                    {
                        max=input[i];
                        input[i]=input[j];
                        input[j]=max;

                    }
            }
            System.out.println(input[i]);
             System.out.println(input[i]);

        }
        
    }

}