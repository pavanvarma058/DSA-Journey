import java.util.Arrays;

public class SearchIn2DArray {
    static void main() {
        int[][] arr = {
                {23, 4, 1},
                {20, 8, 9, 12},
                {27, 33}
        };

        int target = 33;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr, int target){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
