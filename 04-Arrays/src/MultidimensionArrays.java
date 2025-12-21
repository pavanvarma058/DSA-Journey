import java.util.Arrays;
import java.util.Scanner;

public class MultidimensionArrays {
    static void main() {
        /*
        123
        456
        789
        */
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3]; // no.of rows and columns
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print("Enter the number: ");
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // output in different way
        for(int i=0; i<arr.length; i++){
            System.out.println(Arrays.toString(arr[i]));
        }

        // enhanced for loop
        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
