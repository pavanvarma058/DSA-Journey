import java.util.Arrays;

public class Swap {
    static void main() {
        int[] arr = {1, 2, 44, 55, 88};
        swap(arr, 0, 4);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index2];
        arr[index2] = arr[index1];
        arr[index1] = temp;
    }
}
