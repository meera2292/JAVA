import java.util.*;

import javax.lang.model.util.ElementScanner14;
class Task2SumConsecutiveNumbers
{
    public boolean sumcheck(int frst ,int second,int third, int fourth)
    {
        if((frst % 2 == 0) &&(second % 2 == 0)&&(third % 2 == 0)&&(fourth % 2 == 0))
        {
            return true;
        }
        else
        {
            return false;
        }

    }
    public boolean alphacheck(char chr[])
    {
        if(((chr[2]=='A') ||(chr[2]=='E')||(chr[2]=='I')||(chr[2]=='O')||(chr[2]=='U')||(chr[2]=='Y')))
        {
            return true;
        }
        else
        {
            return false;
        }

    }

    public static void main(String[]args) 
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the 'DDXDDD-DD', where D stands for a digit (non zero) and X is an uppercase english letter. ");
        
        try
        {
            String str=obj.nextLine();
            char[] chr=str.toCharArray();
            int frst=(int)chr[0]+(int)chr[1];
            int second=(int)chr[3]+(int)chr[4];
            int third=(int)chr[4]+(int)chr[5];
            int fourth=(int)chr[7]+(int)chr[8];
            if
            if((sumcheck(frst,second,third,fourth) && (alphacheck(chr) )
            {
            
                System.out.println("Valid..... ");
            }
            else
            {
                System.out.println("InValid.....the tag is invalid because it does not satisfy ");


            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        obj.close();
        
        
    }
}