import java.util.*;
class Task3DivisibleInrange{


    public static void main(String[]args)
     {
        Scanner obj=new Scanner(System.in);
        int l,r,k,count=0;
        System.out.println("Enter the the value for l");
        l=obj.nextInt();
        if(l>=1 && l <= 1000)
        {
            System.out.println("Enter the the value for r");
            r=obj.nextInt();
           
            if(r>=1 && r <= 1000)
            {
                System.out.println("Enter the the value for k");
                k=obj.nextInt();
                if(k>=1 && k<=1000)
                {
                    for(int m=l; m<=r;m++)
                    {
                            if(m%k==0)
                            {
                                System.out.println(m+" Its  divisible");
                                count++;
                               
                            }
                            else
                            {
                                System.out.println(m+" Its not divisible by "+k);
                            }
                    }
                    System.out.println("Count Value:: "+count);
        
                }
                else
                {
                    System.out.println("Invalid value of 'k' .....Please enter thr correct value");
                }
                    
            }
            else
            {
                System.out.println("Invalid value of 'r' .....Please enter thr correct value");
            }
  
            }
            else
            {
                System.out.println("Invalid value of 'l'.....Please enter thr correct value");
            }
    }
        
}
