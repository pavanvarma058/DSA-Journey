import java.util.Scanner;

public class Input {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 13;
        arr[2] = 27;
        arr[3] = 29;
        arr[4] = 50;

        System.out.println(arr[0]);

        // input using for loops
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for(int num : arr){
            System.out.println(num);
        }
    }
}
