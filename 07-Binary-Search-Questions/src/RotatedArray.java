public class RotatedArray {
    static void main() {
        // https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
        int[] nums = {1, 0, 1, 1, 1};
        int target = 0;
        System.out.println(search(nums, target));
    }
    public static boolean search(int[] nums, int target) {
        for(int i=0; i<=nums.length-1; i++){
            if(nums[i] == target){
                return true;
            }
        }
        return false;
    }
}
