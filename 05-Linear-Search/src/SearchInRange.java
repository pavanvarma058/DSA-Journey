public class SearchInRange {
    static void main() {
        int[] arr = {2, 4, 5, 99, 20, 12, 25, -98};
        System.out.println(linearSearch(arr, 20, 1, 5));
    }
    static int linearSearch(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }
        for(int i=start; i<=end; i++){
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        return -1;
    }

}
