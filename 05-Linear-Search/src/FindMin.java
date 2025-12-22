public class FindMin {
    static void main() {
        int[] arr = {2, 4, -5, 99, 20, 12, 25, -98};
        System.out.println(minElement(arr));
    }
    static int minElement(int[] arr){
        int ans = arr[0];

        for(int i=1; i<arr.length; i++){
            if(arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
