import java.util.Scanner;

public class array3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = input.nextInt();
        int num[] = new int[size];
        for(int i = 0;i<num.length;i++)
        {
            System.out.println(num[i]);
        }
    }
}/*


5
//default values of int:-
0
0
0
0
0
*/
