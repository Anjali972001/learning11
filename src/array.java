import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();
        int col = input.nextInt();

        int[][] num = new int[row][col];

        for(int i =0; i<row;i++)
        {
            for(int j =0;j<col;j++)
            {
                num[i][j]=input.nextInt();
            }
        }
        for(int i =0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.println(num[i][j] + " " );
            }
            System.out.println();
        }
    }
}
