import java.util.Scanner;

public class trail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.println("Hello");
            }
        }
    }// time complexity will O(n^2) as the operations is performed n*n times
}/*output: 2
Hello
Hello
Hello
Hello<*/
