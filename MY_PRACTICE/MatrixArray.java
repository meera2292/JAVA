import java.util.*;
class MatrixArray
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the no of rows of your Matrix:::");
        int rsize;
        rsize=obj.nextInt();
        System.out.println("Enter the no of columns of your Matrix:::");
        int csize;
        csize=obj.nextInt();
        int[][] arr=new int[rsize][csize];

        for(int i=0;i<rsize;i++)
        {
            for(int j=0;j<csize;j++)
            {
                System.out.println("Enter the elements  of your Matrix:::");
                arr[i][j]=obj.nextInt();
                
            }
        }
        for(int r=0;r<rsize;r++)
        {
            for(int c=0;c<csize;c++)
            {
               
                System.out.print(arr[r][c]+" ");
                
            }
           System.out.println("\n");
        }
    }
}