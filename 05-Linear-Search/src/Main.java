//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    int[] arr = {23, 45, 1, 2, 8, 19, -3, 12, -11, 29};
    int target = 8;
    System.out.println(linearSearch(arr, target));
}
// search in the array: return the index if item found other if item not found return -1
static int linearSearch(int[] arr, int target){
    if(arr.length == 0){
        return -1;
    }
    for(int i=0; i<arr.length; i++){
        int element = arr[i];
        if(element == target){
            return i;
        }
    }
    return -1;
}
