import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of num:: ");
        int num=sc.nextInt();
        int i=0;
        while (i<=num){
            int j=0;
            while (j<=num){
                System.out.print(num-j+1);
                j=j+1;
            }
            System.out.println();
            i=i+1;
        }
    }
}
