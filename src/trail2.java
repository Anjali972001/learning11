import java.util.Scanner;

public class trail2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n= input.nextInt();
        int m= input.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.println("Hello");
            }
        }
    }
}// time complexity will be O(n*m) as no of operations are n*m.
