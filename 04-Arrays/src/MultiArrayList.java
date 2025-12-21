import java.util.ArrayList;
import java.util.Scanner;

public class MultiArrayList {
    static void main() {
        Scanner sc = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

        // initialisation
        for(int i=0; i<3; i++){
            arr.add(new ArrayList<>());
        }

        // add elements
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                arr.get(i).add(sc.nextInt());
            }
        }

        System.out.println(arr);
    }
}
