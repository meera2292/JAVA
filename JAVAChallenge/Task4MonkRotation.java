

import java.util.Scanner;
class Task4MonkRotation {
    static int[] ar=new int[100001];
    public static void main(String args[] ){
        Scanner in=new Scanner(System.in);
        byte t=in.nextByte();
        while(t-->0){
            int n=in.nextInt();
            int k=in.nextInt()%n;
                for(int i=0;i<n-k;i++)
                    ar[i]=in.nextInt();
                for(int i=0;i<k;i++)
                    System.out.print(in.nextInt()+" ");
                for(int i=0;i<n-k;i++)
                    System.out.print(ar[i]+" ");
            System.out.println();
        }
    }
}