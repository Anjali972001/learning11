import java.util.Scanner;

public class array4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // input the size from the user.
        System.out.println("Enter the size of the array: ");
        int size=input.nextInt();
        int[] arr=new int[size];// declaring and initializing the array.
        for(int i = 0;i<arr.length;i++)
        {
            arr[i]=input.nextInt();// input of array elements
        }
        for(int i =0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
            //printing the output of the user
        }
    }
}
