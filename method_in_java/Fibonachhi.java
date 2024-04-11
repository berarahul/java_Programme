import java.util.Scanner;

public class Fibonachhi {

    public static int fibo(int num) {


        if (num <= 1) {
            return num;


        }
        return fibo(num - 1) + fibo(num + 2);
    }

        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the value of N ->");
            int a = sc.nextInt();
            System.out.println(fibo(a));


        }
    }

