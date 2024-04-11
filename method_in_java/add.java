import java.util.Scanner;

public class add {
    public static void main(String[] args) {
        //Q. take input of two numbers and print the sum
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:: ");
        int first=sc.nextInt();
        System.out.println("Enter the second number:: ");
        int second =sc.nextInt();
        int sum=first+second;
        System.out.println("The sum is :: "+sum);
    }
}
