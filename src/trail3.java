import java.util.Scanner;

public class trail3 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n=input.nextInt();
        int m= input.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("*");
        }
        for(int j=0;j<m;j++)
        {
            System.out.println("*");
        }
    }
}
// time complexity will be O(n)+O(m)=O(n)---> as the n>m