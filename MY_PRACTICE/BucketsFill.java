import java.util.*;

public class BucketsFill {
    public static void main(String[] args) 
    {
        int[] buckets = new int[10]; // initialize an array of 10 buckets with 0 liters each
        Scanner obj = new Scanner(System.in);

        while (true) 
        {
            System.out.print("Enter the number of liters to fill: ");
            int liters = obj.nextInt();

            // find the index of the lowest non-full bucket
            int minIndex = -1;

            for (int i = 0; i < 10; i++)
            {
                if (buckets[i] < 100 && (minIndex == -1 || buckets[i] < buckets[minIndex])) 
                {
                    minIndex = i;
                }
            }

            if (minIndex == -1) 
            {
                System.out.println("All buckets are full.");
            } 
            else 
            {
            int remaining = 100 - buckets[minIndex];
            if (liters <= remaining)
                {
                    buckets[minIndex] += liters;
                } 
                else
                 {
                    buckets[minIndex] = 100;
                    System.out.println("Bucket " + minIndex + " is now full.");
                    liters -= remaining;
                    // recursively fill the remaining liters into the other buckets
                    main(new String[] { Integer.toString(liters) });
                    break;
                }
            }

            System.out.println("Buckets:");
            for (int i = 0; i < 10; i++) 
            {
                System.out.println("Bucket " + i + ": " + buckets[i] + " liters");
            }
        }
    }
}
