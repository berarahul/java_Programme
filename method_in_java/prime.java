import java.util.Scanner;

public class prime {

    public static boolean isprime(int num) {

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;

            }

        }

        return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number that you want check this is prime or not prime:: ");
        int a = sc.nextInt();
        isprime(a);
        if (isprime(a)) {
            System.out.println("is a prime number" );
        } else {
            System.out.println( "not a prime number");

        }
    }
}
