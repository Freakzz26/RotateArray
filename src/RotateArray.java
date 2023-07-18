import java.util.Scanner;

public class RotateArray {
    static void Rotate(int arr[][],int rows,int cols)
    {
        int temp=0;
        int result[][]=new int[rows][cols];
        for (int i =0;i<rows;i++)
        {
            for (int j=0;j<cols;j++)
            {
                result[i][j]=arr[j][i];
            }
        }
        for(int i=0;i<result.length;i++)
        {
            int start=0;
            int end=result[0].length-1;
            while(start<end)
            {
                temp=result[i][start];
                result[i][start]=result[i][end];
                result[i][end]=temp;
                start++;
                end--;
            }
        }
        for (int i =0;i<rows;i++)
        {
            for (int j=0;j<cols;j++)
            {
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int rows=scanner.nextInt();
        int cols=scanner.nextInt();
        int array[][]=new int[rows][cols];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                array[i][j]=scanner.nextInt();
            }
        }
        Rotate(array,rows,cols);

    }
}
