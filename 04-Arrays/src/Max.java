public class Max {
    static void main() {
        int[] arr = {1, 2, 44, 55, 88};
        System.out.println("Max item: " + maxItem(arr));
        System.out.println("Max item in the given range: " + maxRange(arr, 0, 2));
    }
    static int maxItem(int[] arr){
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    static int maxRange(int[] arr, int start, int end){
        if(end > start){
            return -1;
        }

        if(arr == null){
            return -1;
        }
        int max = arr[start];
        for(int i=start; i<=end; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
