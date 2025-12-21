import java.lang.reflect.Array;
import java.util.Arrays;

public class PassingInFunctions {
    static void main() {
        int[] nums = {3, 4, 5, 12};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] nums){
        nums[0] = 22;
    }
}
