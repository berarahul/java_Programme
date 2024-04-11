import java.util.Scanner;

public class calculation {
    public static int equation(int n) {
       int sol=0;

             sol=3*n+7;
            System.out.println("solution is"+sol);
//            break;

        return sol;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N:- ");
        int a =sc.nextInt();
        equation(a);

    }
}
