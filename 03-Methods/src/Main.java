//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    // Q: Take input of 2 numbers and print sum
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter first number: ");
    int num1 = sc.nextInt();
    System.out.print("Enter second number: ");
    int num2 = sc.nextInt();

    System.out.println(sum(num1, num2));
}

static int sum(int a, int b){
    int ans = a + b;
    return ans;
}
