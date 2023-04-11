
package org.coursera.lab.remove;

public class remove
{
    public static int[] removeele(int[] number)
    {
        int[] result = new int[number.length - 1];
        int j = 0;
        for (int i = 0; i < number.length - 1; i++)
        {
            result[j] = number[i];
            j++;
        }
        return result;
    }
    
    public static int[] removeele(int[] number, int element)
    {
        int[] result = new int[number.length - 1];
        int j = 0;
        for(int i = 0; i < number.length; i++) 
        {
            if (i != element) 
            {
                result[j] = number[i];
                j++;
            }
        }
        return result;
    }
}
