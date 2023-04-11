public class Armstrong
 {
    public static boolean isArmstrong(int number){
      int r,sum=0,temp;
        temp = number;    
        while (number > 0)
        {
            r = number % 10;
            sum = sum + (r * r * r);
            number = number / 10;
        }
        if  (temp == sum)
        {
            return true;
            
        }
        else
        {
            return false;
        }
    }
    
}
