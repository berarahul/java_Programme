import java.util.Scanner;

public class Combination {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        System.out.print("Enter the value of r: ");
        int r = scanner.nextInt();
        int nCr = factorial(n) / (factorial(r) * factorial(n-r));
        System.out.println("The value of " + n + "C" + r + " is " + nCr);
    }

    public static int factorial(int num) {
        int result = 1;
        for(int i=2; i<=num; i++) {
            result *= i;
        }
        return result;
    }
}
