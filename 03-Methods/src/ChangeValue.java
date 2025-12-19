import java.lang.reflect.Array;
import java.util.Arrays;

public class ChangeValue {
    static void main() {
        int[] arr = {1, 2, 4, 8, 55, 100};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums){
        nums[0] = 99;
    }
}
