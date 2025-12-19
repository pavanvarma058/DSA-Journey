import java.util.Scanner;

public class ArmstrongNum {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
//        int n = sc.nextInt();
//        System.out.println(isArmstrong(n));

        for(int i=100; i<1000; i++){
            if(isArmstrong(i)){
                System.out.print(i + " ");
            }
        }
    }
    // print all the three digit Armstrong numbers
    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;
        while(n>0){
            int rem = n%10;
            sum += cube(rem);
            n = n / 10;
        }
        return sum == original;
    }
    static int cube(int n){
        return n*n*n;
    }
}
