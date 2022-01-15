import java.util.Scanner;

//create an array of 5 elements and then print the values....
public class array2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr; //declaration of an array
        arr = new int[5]; // declaration of an array
        for(int i =0;i<arr.length;i++)
        {
            arr[i]=input.nextInt();
        }
        for(int result:arr)
        {
            System.out.println(result);
        }


    }

}/*
    input: 1 2 3 4 5
    output: 1 2 3 4 5
*/
