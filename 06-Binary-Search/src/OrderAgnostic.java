public class OrderAgnostic {
    static void main() {
        int[] arr = {-18, -12, -9, -1, 2, 4, 6, 8, 22, 25, 44, 88, 95, 98};
        int target = 2;
        System.out.println(orderAgnostic(arr, target));
    }
    static int orderAgnostic(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            // middle element: (start + end) / 2
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            else {
                if(target > arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
