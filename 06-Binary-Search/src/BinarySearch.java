
void main() {
    int[] arr = {-18, -12, -9, -1, 2, 4, 6, 8, 22, 25, 44, 88, 95, 98};
    int target = 2;
    System.out.println(binarySearch(arr, target));
}
// return the index
// return -1 if it does not exist
static int binarySearch(int[] arr, int target){
    int start = 0;
    int end = arr.length - 1;
    while(start <= end){
        // middle element: (start + end) / 2
        int mid = start + (end - start) / 2;
        if(target < arr[mid]){
            end = mid - 1;
        } else if (target > arr[mid]) {
            start = mid + 1;
        } else {
            return mid;
        }
    }
    return -1;
}
