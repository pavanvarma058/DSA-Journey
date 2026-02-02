//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    int[] arr = {2, 3, 5, 9, 14, 16, 18};
    int target = 20;
    int ans = ceiling(arr, target);
    System.out.println(ans);
}
static int ceiling(int[] arr, int target){
    // return the index of smallest no >= target

    // what if the target is greater than the greatest number in the array
    if(target > arr[arr.length - 1]){
        return -1;
    }

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
    return start;
}
